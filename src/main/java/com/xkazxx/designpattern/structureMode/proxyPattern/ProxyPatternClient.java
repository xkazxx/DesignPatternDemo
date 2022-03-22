package com.xkazxx.designpattern.structureMode.proxyPattern;

import com.xkazxx.designpattern.structureMode.proxyPattern.bean.CGlibProxyEnhancer;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.JDKDynamicProxyHandler;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.Homeowner;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.House;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.IHomeowner;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.RentClient;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.StaticProxyHomeowner;


import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 静态代理，通过实现接口来完成代理功能
 * 代理需要手动生成被代理对象，多个对象就需要多分代理对象的代码实现
 *
 *
 * @author: created by xkazxx
 * @version v0.1
 * @description: description
 * @date: 2022/3/20 17:14
 **/
public class ProxyPatternClient {

  public static void main(String[] args) {
//    testStaticPoxy();
    System.out.println("=====================================");
//    testJDKDynamicPoxy();
    System.out.println("=====================================");
    testCGlibDynamicPoxy();
  }

  private static void testCGlibDynamicPoxy() {
    Homeowner homeowner = new Homeowner(new House("天府新区精装大平层"));
    CGlibProxyEnhancer methodInterceptor = CGlibProxyEnhancer.ofObject(homeowner);
    Homeowner proxyObject = (Homeowner) methodInterceptor.getProxyObject();
    proxyObject.rentHouse(new RentClient(5, "张三5号"));

  }

  private static void testJDKDynamicPoxy() {
    Homeowner homeowner = new Homeowner(new House("成华区套3别致花园房"));
    JDKDynamicProxyHandler jdkDynamicProxyHandler = JDKDynamicProxyHandler.ofObject(homeowner);// 代理对象生成器,被代理对象必须继承自一个接口
    IHomeowner proxyObject = (IHomeowner) jdkDynamicProxyHandler.getProxyObject(); // 动态生成的代理对象
    System.out.println(proxyObject.getHouseInfo());
    proxyObject.rentHouse(new RentClient(5, "张三5号"));

    // 匿名写法
    Homeowner homeowner2 = new Homeowner(new House("成华区套3别致花园房"));
    IHomeowner proxyInstance = (IHomeowner) Proxy.newProxyInstance(ProxyPatternClient.class.getClassLoader(), homeowner2.getClass().getInterfaces(), (proxy, method, args) -> {
      if ("rentHouse".equals(method.getName())) {
        System.out.println(((RentClient) args[0]).getName() + " 客户愿意租这房子");
      }
      Object invoke = method.invoke(homeowner2, args);
      if ("rentHouse".equals(method.getName())) {
        System.out.println("签订合同，[" + ((RentClient) args[0]).getName() + "]出租成功！");
      }

      if ("getHouseInfo".equals(method.getName())) {
        House invoke1 = (House) invoke;
        invoke1.setName("这是匿名动态代理准备出租的房子：" + invoke1.getName());
      }
      return invoke;
    });
    System.out.println(proxyInstance.getHouseInfo());
    proxyInstance.rentHouse(new RentClient(11, "张三11号"));
  }


  public static void testStaticPoxy() {
    // 房主有大别墅，想要出租
    Homeowner homeowner = new Homeowner(new House("高新区临湖大别墅"));
    // 房主将大别墅委托给中介，找到有意向租房的客户
    StaticProxyHomeowner proxyHomeowner = new StaticProxyHomeowner(homeowner);

    // 想要租房的客户
    List<RentClient> rentClients = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      rentClients.add(new RentClient(i + 1, "张三" + (i + 1) + "号"));
    }

    // 现在这些人想租房,中介先带看房子
    for (RentClient rentClient : rentClients) {
      proxyHomeowner.seeHouse(rentClient);
    }

    // 最终2号用户确定要租房
    proxyHomeowner.rentHouse(rentClients.get(2));
  }
}

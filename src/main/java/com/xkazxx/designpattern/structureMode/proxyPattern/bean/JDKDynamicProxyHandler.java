package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理基于接口实现
 * 没有实现接口的普通类无法代理
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.proxyPattern.bean
 * date:2022/3/22
 */
@Data
public class JDKDynamicProxyHandler implements InvocationHandler {
  private Object target; // 动态代理，代理一类客户

  public JDKDynamicProxyHandler() {
  }

  public void setTarget(Object target) {
    this.target = target;
  }

  public static JDKDynamicProxyHandler ofObject(Object target) {
    JDKDynamicProxyHandler jDKDynamicProxyHandler = new JDKDynamicProxyHandler();
    jDKDynamicProxyHandler.setTarget(target);
    return jDKDynamicProxyHandler;
  }

  public Object getProxyObject() {
    return Proxy.newProxyInstance(JDKDynamicProxyHandler.class.getClassLoader(), this.target.getClass().getInterfaces(), this);
  }


  public void signContract(RentClient arg) {
    System.out.println("签订合同，[" + arg.getName() + "]出租成功！");
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if ("rentHouse".equals(method.getName())) {
      System.out.println(((RentClient) args[0]).getName() + " 客户愿意租这房子");
    }
    Object invoke = method.invoke(target, args);
    if ("rentHouse".equals(method.getName())) {
      signContract(((RentClient) args[0]));
    }

    if ("getHouseInfo".equals(method.getName())) {
      House invoke1 = (House) invoke;
      invoke1.setName("这是动态代理准备出租的房子：" + invoke1.getName());
    }
    return invoke;
  }
}

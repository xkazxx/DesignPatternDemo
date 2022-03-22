package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGlib是根据extends来实现代理的
 * 无法代理final修饰的方法
 * 无法代理final修饰的类
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.proxyPattern.bean
 * date:2022/3/22
 */

public class CGlibProxyEnhancer {
  private Enhancer enhancer;

  private CGlibProxyEnhancer() {
  }

  public static CGlibProxyEnhancer ofObject(Object target) {
    CGlibProxyEnhancer cGlibProxyEnhancer = new CGlibProxyEnhancer();
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(target.getClass());
    enhancer.setCallback(createCallback(target));
    cGlibProxyEnhancer.enhancer = enhancer;
    return cGlibProxyEnhancer;
  }

  private static Callback createCallback(Object target) {
    // 此处自定义代理需要做的其他事情，有多种callback来实现相关功能
    return new MethodInterceptor() {
      @Override
      public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        return method.invoke(target, args);
      }
    };
  }

  public Object getProxyObject() {
    return enhancer.create();
  }
}

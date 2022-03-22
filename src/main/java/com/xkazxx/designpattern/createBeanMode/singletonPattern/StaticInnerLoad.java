package com.xkazxx.designpattern.createBeanMode.singletonPattern;

/**
 * 没用到内部类时，加载外部类不会出发内部类的加载。所以是线程安全懒加载
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/22
 */
public class StaticInnerLoad {


  private StaticInnerLoad() {
  }

  public static StaticInnerLoad getInstance() {
    return Holder.instance;
  }

  private static class Holder {
    private static volatile StaticInnerLoad instance = new StaticInnerLoad();
  }

}

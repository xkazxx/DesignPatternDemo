package com.xkazxx.designpattern.createBeanMode.singletonPattern;

/**
 * 1、反射Class对象的newInstance创建枚举对象会抛出异常
 * 2、所有的枚举都是class对象且继承自Enum类，属于热加载
 * 3、没有实现serializable接口，不能通过序列化与反序列化加载
 * 所以枚举是绝对保证单例的
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/22
 */
public enum SingleTonEnum {
  instance;


  public SingleTonEnum getInstance() {
    return instance;
  }

}

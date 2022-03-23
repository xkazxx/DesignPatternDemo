package com.xkazxx.designpattern.createBeanMode.singletonPattern;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 热加载
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/22
 */
public class HungryLoad implements Serializable{

  private static final long serialVersionUID = 4049481168418029809L;

  private static final HungryLoad instance = new HungryLoad();

  private HungryLoad() {

  }

  public static HungryLoad getInstance() {
    return instance;
  }

  private Object readResolve(){
    // 反序列化时，ObjectInputStream的readObject方法执行过程分钟会反射调用该方法
    return instance;
  }

  private void readObject(ObjectInputStream ois)throws java.io.IOException, ClassNotFoundException {
    ois.defaultReadObject();
    System.out.println("HungryLoad readObject end!!!");
  }

  private void writeObject(ObjectOutputStream oos) throws java.io.IOException {
    oos.defaultWriteObject();
    System.out.println("HungryLoad writeObject end!!!");
  }
}

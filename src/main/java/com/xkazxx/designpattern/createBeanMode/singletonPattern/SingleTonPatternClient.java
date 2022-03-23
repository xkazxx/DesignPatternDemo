package com.xkazxx.designpattern.createBeanMode.singletonPattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/23
 */
public class SingleTonPatternClient {

  public static void main(String[] args) throws Exception {
    testHungryLoad();
    System.out.println("=====================================");
    testLazyLoad();
    System.out.println("=====================================");
    testStaticInnerLoad();
    System.out.println("=====================================");
    testEnumLoad();

  }

  private static void testLazyLoad() throws Exception {
//   反射直接破坏单例
//    LazyLoad instance = LazyLoad.getInstance();
//    final Class<LazyLoad> lazyLoadClass = LazyLoad.class;
//    final Constructor<LazyLoad> declaredConstructor = lazyLoadClass.getDeclaredConstructor();
//    declaredConstructor.setAccessible(true);
//    final LazyLoad lazyLoad = declaredConstructor.newInstance();  // 构造器创建
//    System.out.println(instance == lazyLoad);

//    方式1，在构造方法中加锁判断instance时候已经初始化 (先反射创建对象，在getInstance才能破坏成功)
//    final Class<LazyLoad> lazyLoadClass = LazyLoad.class;
//    final Constructor<LazyLoad> declaredConstructor = lazyLoadClass.getDeclaredConstructor();
//    declaredConstructor.setAccessible(true);
//    final LazyLoad lazyLoad = declaredConstructor.newInstance();
//
//    LazyLoad instance = LazyLoad.getInstance();
//    System.out.println(instance == lazyLoad);

//    方式2，在构造方法中加锁判断instance时候已经初始化 (反射直接修改内部变量的值可以破坏单例，前提是知道这个标识字段的名字, 可以把标识字段设置为UUID这种)
    Class<LazyLoad> lazyLoadClass = LazyLoad.class;
    Constructor<LazyLoad> declaredConstructor = lazyLoadClass.getDeclaredConstructor();
    declaredConstructor.setAccessible(true);
    LazyLoad lazyLoad = declaredConstructor.newInstance();
    Field initFlag = lazyLoad.getClass().getDeclaredField("initFlag");
    initFlag.setAccessible(true);
    initFlag.set(lazyLoad, false);

    LazyLoad instance = LazyLoad.getInstance();

    System.out.println(instance == lazyLoad);
  }

  private static void testEnumLoad() throws Exception {
    final SingleTonEnum instance = SingleTonEnum.instance;
    final Constructor<SingleTonEnum> declaredConstructor = SingleTonEnum.class.getDeclaredConstructor(String.class, int.class);
    declaredConstructor.setAccessible(true);
    final SingleTonEnum singleTonEnum = declaredConstructor.newInstance("nihao", 1);
    System.out.println(instance);
    System.out.println(singleTonEnum);
    System.out.println(instance==singleTonEnum);
  }

  private static void testStaticInnerLoad() {
    final StaticInnerLoad instance = StaticInnerLoad.getInstance();
    final StaticInnerLoad instance2 = StaticInnerLoad.getInstance();
    System.out.println(instance2);
    System.out.println(instance);

  }

  private static void testHungryLoad() {
    // 验证反序列
    HungryLoad instance = HungryLoad.getInstance();
    ByteArrayInputStream byteArrayInputStream = null;
    ObjectInputStream ois = null;
    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(out)) {
      oos.writeObject(instance);
      byteArrayInputStream = new ByteArrayInputStream(out.toByteArray());
      ois = new ObjectInputStream(byteArrayInputStream);
      final HungryLoad o = (HungryLoad) ois.readObject();
      System.out.println(o == instance);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (byteArrayInputStream != null) {
        try {
          byteArrayInputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (ois != null) {
        try {
          ois.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
}

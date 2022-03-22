package com.xkazxx.designpattern.createBeanMode.singletonPattern;

/**
 * 懒加载 volatile + 双检锁
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/22
 */
public class LazyLoad {

  private static volatile LazyLoad instance;

  private LazyLoad() {
  }

  public static LazyLoad getInstance() {
    if (instance == null) {  // 这里判空，是减少获取锁，提高效率
      synchronized (LazyLoad.class) { // 这里加锁是保证并发的安全性
        if (instance == null) { // 保证并发的安全性
          instance = new LazyLoad(); // volatile 避免指令重排，保证其他线程拿到的instance是初始化完毕的对象
        }
      }
    }
    return instance;
  }
}

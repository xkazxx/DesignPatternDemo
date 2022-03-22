package com.xkazxx.designpattern.createBeanMode.singletonPattern;

/**
 * 热加载
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.createBeanMode.singletonPattern
 * date:2022/3/22
 */
public class HungryLoad {


  private static final HungryLoad instance = new HungryLoad();

  private HungryLoad(){

  }

  public static HungryLoad getInstance(){
    return instance;
  }

}

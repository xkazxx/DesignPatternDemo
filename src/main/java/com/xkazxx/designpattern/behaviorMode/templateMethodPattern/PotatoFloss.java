package com.xkazxx.designpattern.behaviorMode.templateMethodPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.templateMethodPattern
 * date:2022/3/24
 */
public class PotatoFloss extends AbstractCookTemplate{


  @Override
  protected void pickVegetables() {
    System.out.println(" 洗土豆");
  }

  @Override
  protected void cutVegetables() {
    System.out.println(" 切土豆");
  }

  @Override
  protected void cookVegetables() {
    System.out.println(" 开火炒土豆丝");
  }

  @Override
  protected void savingVegetables() {
    System.out.println(" 土豆丝出锅装盘");
  }
}

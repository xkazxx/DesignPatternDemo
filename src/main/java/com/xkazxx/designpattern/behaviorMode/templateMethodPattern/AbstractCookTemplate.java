package com.xkazxx.designpattern.behaviorMode.templateMethodPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.templateMethodPattern
 * date:2022/3/24
 */
public abstract class AbstractCookTemplate {
  final public void cook() {
    // 做菜的固定模板
    pickVegetables(); // 摘菜
    cutVegetables(); // 切菜
    cookVegetables(); // 做菜
    savingVegetables(); // 装盘
  }

  protected abstract void pickVegetables();

  protected abstract void cutVegetables();

  protected abstract void cookVegetables();

  protected abstract void savingVegetables();

}

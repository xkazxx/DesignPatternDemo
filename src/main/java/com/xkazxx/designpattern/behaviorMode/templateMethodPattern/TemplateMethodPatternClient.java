package com.xkazxx.designpattern.behaviorMode.templateMethodPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.templateMethodPattern
 * date:2022/3/24
 */
public class TemplateMethodPatternClient {

  public static void main(String[] args) {
    PotatoFloss potatoFloss = new PotatoFloss();
    // 没有模板方法需要要自己处理做菜的流程
    potatoFloss.pickVegetables();
    potatoFloss.cutVegetables();
    potatoFloss.cookVegetables();
    potatoFloss.savingVegetables();
    System.out.println("=====================================");
    // 有了模板方法直接调用模板方法一步完成
    potatoFloss.cook();
  }
}

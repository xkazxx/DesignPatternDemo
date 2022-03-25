package com.xkazxx.designpattern.behaviorMode.statePattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.statePattern
 * date:2022/3/25
 */
public interface State {

  void doAction(Person person);
}

class ChildhoodState implements State {

  @Override
  public void doAction(Person person) {
    System.out.println("【" + person.getName() + "】处于幼年状态，每天开心的玩耍！");
  }
}

class YouthState implements State {

  @Override
  public void doAction(Person person) {
    System.out.println("【" + person.getName() + "】处于青年状态，好好学习，天天向上！");
  }
}

class MiddleAgedState implements State {

  @Override
  public void doAction(Person person) {
    System.out.println("【" + person.getName() + "】处于中年状态，努力工作，幸福生活！");
  }
}

class elderlyState implements State {

  @Override
  public void doAction(Person person) {
    System.out.println("【" + person.getName() + "】处于老年状态，幸福生活、儿孙满堂！");
  }
}
package com.xkazxx.designpattern.behaviorMode.observerPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.observerPattern
 * date:2022/3/25
 */
public abstract class Observer {
  protected Subject subject;

  public Observer(Subject subject) {
    this.subject = subject;
  }

  public abstract void reaction();

}

class Observer1 extends Observer {
  public Observer1(Subject subject) {
    super(subject);
    subject.attach(this);
  }

  @Override
  public void reaction() {
    if (subject.getState() > 5) {
      System.out.println("1号观察者: 目标状态 大于5");

    }
    if (subject.getState() <= 5) {
      System.out.println("1号观察者: 目标状态 小于等于5");
    }
  }
}

class Observer2 extends Observer {
  public Observer2(Subject subject) {
    super(subject);
    subject.attach(this);
  }

  @Override
  public void reaction() {
    if (subject.getState() > 10) {
      System.out.println("2号观察者: 目标状态 大于10");

    }
    if (subject.getState() <= 10) {
      System.out.println("2号观察者: 目标状态 小于等于10");
    }
  }
}

class Observer3 extends Observer {
  public Observer3(Subject subject) {
    super(subject);
    subject.attach(this);
  }

  @Override
  public void reaction() {
    if (subject.getState() > 0) {
      System.out.println("3号观察者: 目标状态 大于0");

    }
    if (subject.getState() <= 10) {
      System.out.println("3号观察者: 目标状态 小于等于10");
    }
  }
}

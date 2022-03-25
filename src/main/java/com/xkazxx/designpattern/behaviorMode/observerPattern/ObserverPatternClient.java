package com.xkazxx.designpattern.behaviorMode.observerPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.observerPattern
 * date:2022/3/25
 */
public class ObserverPatternClient {

  public static void main(String[] args) throws InterruptedException {
    MoneySubject moneySubject = new MoneySubject(0);
    new Observer1(moneySubject);
    new Observer2(moneySubject);
    new Observer3(moneySubject);
    for (int i = -10; i < 12; i += 3) {
      moneySubject.setState(i);
      moneySubject.notifyAllObserves();
      System.out.println("=================================");
      Thread.sleep(5000);
    }

  }
}

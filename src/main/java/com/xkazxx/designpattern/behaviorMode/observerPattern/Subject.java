package com.xkazxx.designpattern.behaviorMode.observerPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 主题（目标）-被观察的对象
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.observerPattern
 * date:2022/3/25
 */
public abstract class Subject {

  private final List<Observer> observers;
  private int state;

  protected Subject(int state) {
    this.observers = new LinkedList<>();
    this.state = state;
  }

  protected final void attach(Observer observer){
    observers.add(observer);
  }

  protected final void detach(Observer observer){
    observers.remove(observer);
  }

  protected final void notifyAllObserves(){
    for (Observer observer : observers) {
      observer.reaction();
    }
  }

  protected int getState() {
    return state;
  }

  protected void setState(int state) {
    this.state = state;
  }
}

class MoneySubject extends Subject{

  public MoneySubject(int state) {
    super(state);
  }
}

package com.xkazxx.designpattern.behaviorMode.statePattern;

/**
 *
 *
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.statePattern
 * date:2022/3/25
 */
public class Person {
  private String name;
 private State state;

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, State state) {
    this.name = name;
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}

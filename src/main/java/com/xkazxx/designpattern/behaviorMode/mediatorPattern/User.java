package com.xkazxx.designpattern.behaviorMode.mediatorPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.mediatorPattern
 * date:2022/3/25
 */
public class User {
  private String name;

  public User(String name) {
    this.name = name;

  }

  public Boolean sendMessage(String message, User user) {
    System.out.println("[" + getName() + "]给[" + user.getName() + "]发送消息: " + message);
    return user.receiveMessage(message, this);
  }

  public Boolean receiveMessage(String message, User user){
    System.out.println("[" + getName() + "]收到[" + user.getName() + "]发送消息: " + message);
    return Boolean.TRUE;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
package com.xkazxx.designpattern.behaviorMode.memorandumPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.memorandumPattern
 * date:2022/3/25
 */
public class Version {
  private String message;


  public Version(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

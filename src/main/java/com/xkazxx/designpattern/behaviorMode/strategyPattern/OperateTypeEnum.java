package com.xkazxx.designpattern.behaviorMode.strategyPattern;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.strategyPattern
 * date:2022/3/25
 */
public enum OperateTypeEnum {
  add(1, "乘法", AddHandler.class),
  sub(2, "乘法", SubtractHandler.class),
  multi(3, "乘法", MultiHandler.class),
  div(4, "乘法", DivideHandler.class),
  ;


  private int type;
  private String desc;
  private Class aClass;

  OperateTypeEnum(int type, String desc, Class aClass) {
    this.type = type;
    this.desc = desc;
    this.aClass = aClass;

  }

  public static Optional<OperateTypeEnum> getOperateTypeEnum(int type) {
    return Arrays.stream(values()).filter(typeEnum -> typeEnum.type == type).findAny();
  }

  public int getType() {
    return type;
  }

  public String getDesc() {
    return desc;
  }

  public Class getaClass() {
    return aClass;
  }
}

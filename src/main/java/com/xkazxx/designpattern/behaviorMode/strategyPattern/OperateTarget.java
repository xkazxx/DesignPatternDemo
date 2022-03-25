package com.xkazxx.designpattern.behaviorMode.strategyPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.strategyPattern
 * date:2022/3/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperateTarget {
  private int param1;
  private int param2;
  private int operate;

  public int startCalc() {
    final Optional<IStrategyHandler> optional = IStrategyHandler.getHandler(operate);
    if(optional.isPresent()){
      return optional.get().handler(this);
    }
    throw new IllegalStateException("无法处理该对象的计算！");
  }
}


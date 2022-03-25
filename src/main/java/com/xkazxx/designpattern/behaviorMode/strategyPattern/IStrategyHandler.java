package com.xkazxx.designpattern.behaviorMode.strategyPattern;

import lombok.SneakyThrows;

import java.util.Optional;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.strategyPattern
 * date:2022/3/25
 */
public abstract class IStrategyHandler {

  protected abstract int handler(OperateTarget target);

  public static Optional<IStrategyHandler> getHandler(int type) {
    final Optional<OperateTypeEnum> optional = OperateTypeEnum.getOperateTypeEnum(type);
    if (optional.isPresent()) {
      final IStrategyHandler handler;
      try {
        handler = (IStrategyHandler) optional.get().getaClass().newInstance();
        return Optional.of(handler);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return Optional.empty();
  }
}


class AddHandler extends IStrategyHandler {

  @Override
  public int handler(OperateTarget target) {
    return target.getParam1() + target.getParam2();
  }
}

class SubtractHandler extends IStrategyHandler {

  @Override
  public int handler(OperateTarget target) {
    return target.getParam1() - target.getParam2();
  }
}


class MultiHandler extends IStrategyHandler {

  @Override
  public int handler(OperateTarget target) {
    return target.getParam1() * target.getParam2();
  }

}

class DivideHandler extends IStrategyHandler {

  @Override
  public int handler(OperateTarget target) {
    return target.getParam1() / target.getParam2();
  }

}
package com.xkazxx.designpattern.behaviorMode.strategyPattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.behaviorMode.strategyPattern
 * date:2022/3/25
 */
public class StrategyPatternClient {


  public static void main(String[] args) {

    OperateTarget operateTarget1 = new OperateTarget(10, 10, 1);
    OperateTarget operateTarget2 = new OperateTarget(10, 10, 2);
    OperateTarget operateTarget3 = new OperateTarget(10, 10, 3);
    OperateTarget operateTarget4 = new OperateTarget(10, 10, 4);

    System.out.println(operateTarget1.startCalc());
    System.out.println(operateTarget2.startCalc());
    System.out.println(operateTarget3.startCalc());
    System.out.println(operateTarget4.startCalc());

  }
}

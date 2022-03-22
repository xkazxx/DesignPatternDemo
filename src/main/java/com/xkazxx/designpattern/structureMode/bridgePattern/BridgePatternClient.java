package com.xkazxx.designpattern.structureMode.bridgePattern;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.bridgePattern
 * date:2022/3/21
 */
public class BridgePatternClient {

  public static void main(String[] args) {
    // 桥接模式连接了电脑的类型和电脑品牌两个没有关系的属性，而且方便类型和品牌的横向扩展
    // 当出现戴尔平板电脑的时候，只需要brand新增戴尔 + category新增平板电脑，在通过Computer直接组装
    // 避免了新增很多的电脑子类
    Computer computer1 = new Computer(new Huawei(), new Laptop());
    Computer computer2 = new Computer(new Lenovo(), new Desktop());

    System.out.println(computer1.info());
    System.out.println(computer2.info());

  }
}

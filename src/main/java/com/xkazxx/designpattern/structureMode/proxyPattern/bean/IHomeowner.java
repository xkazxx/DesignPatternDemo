package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.proxyPattern.bean
 * date:2022/3/22
 */
public interface IHomeowner {
   void rentHouse(RentClient rentClient);
   House getHouseInfo();
}

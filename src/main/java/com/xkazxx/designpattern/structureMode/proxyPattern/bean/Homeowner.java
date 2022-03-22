package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.proxyPattern.bean
 * date:2022/3/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homeowner implements IHomeowner {
  private House house;

  @Override
  public void rentHouse(RentClient rentClient) {
    System.out.println("房东把房子出租了！");
  }

  @Override
  public House getHouseInfo() {
    return house;
  }

}


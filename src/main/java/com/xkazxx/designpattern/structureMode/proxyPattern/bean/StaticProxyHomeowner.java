package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import lombok.Data;

/**
 * @author created by xkazxx
 * @version v0.0.1
 * description: com.xkazxx.designpattern.structureMode.proxyPattern.bean
 * date:2022/3/22
 */
@Data
public class StaticProxyHomeowner {
  private Homeowner homeowner;

  public StaticProxyHomeowner() {
  }

  public StaticProxyHomeowner(Homeowner homeowner) {
    this.homeowner = homeowner;
    releaseHouse();
  }

  public void rentHouse(RentClient rentClient) {
    System.out.println(rentClient.getName() + " 客户愿意租这房子");
    homeowner.rentHouse(rentClient);
    signContract();
  }

  public void releaseHouse() {
    System.out.println("中介发布了房屋信息[" + homeowner.getHouse().getName() + "]");
  }

  public void seeHouse(RentClient rentClient) {
    System.out.println("中介带[" + rentClient.getName() + "] 看了房！");
  }

  public void signContract() {
    System.out.println("签订合同，[" + homeowner.getHouse().getName() + "]出租成功！");
  }


}

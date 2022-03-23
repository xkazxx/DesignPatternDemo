package com.xkazxx.designpattern.structureMode.flyweightPattern;

/**
 * 模拟餐馆，盘子都是所有客户共享的，来一个客人的时候就去盘子工厂中取一个盘子
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:54
 **/
public class FlyweightPatternClient {

	public static void main(String[] args) {

		PlateFactory.initPlate(5);// 餐馆开门。默认准备了五个盘子
		PlateFactory.getCircle(1);
		PlateFactory.getCircle(2);
		PlateFactory.getCircle(3);
		PlateFactory.getCircle(4);
		PlateFactory.getCircle(5);
//		陆陆续续来了又走了些客人，但是盘子始终够用，到了中午客人多了，需要10个盘子了

		PlateFactory.getCircle(6);
		PlateFactory.getCircle(7);
		PlateFactory.getCircle(8);
		PlateFactory.getCircle(9);
		PlateFactory.getCircle(10);
	}
}

package com.xkazxx.designpattern.createBeanMode.FactoryParttern;

import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Tire;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.WULinCar;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:17
 **/
public class WuLiCarCarFactory implements CarFactoryMethod, AbstractCarFactory{
	@Override
	public Car getCar() {
		return new WULinCar("五菱mini", "五菱宏光", 42000.0);
	}

	@Override
	public Tire getTire() {
		return new Tire("轮胎", "马牌轮胎", 600.0);
	}
}

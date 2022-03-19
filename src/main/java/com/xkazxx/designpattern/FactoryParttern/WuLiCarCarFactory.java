package com.xkazxx.designpattern.FactoryParttern;

import com.xkazxx.designpattern.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.FactoryParttern.bean.Tire;
import com.xkazxx.designpattern.FactoryParttern.bean.WULinCar;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:17
 **/
public class WuLiCarCarFactory implements CarFactoryMethod, AbstractCarFactory{
	@Override
	public Car getCar() {
		WULinCar wuLinCar = new WULinCar();
		wuLinCar.setName("五菱mini");
		wuLinCar.setCarType("五菱宏光");
		wuLinCar.setPrice(42000.0);
		return wuLinCar;
	}

	@Override
	public Tire getTire() {
		return new Tire("轮胎", "马牌轮胎", 600.0);
	}
}

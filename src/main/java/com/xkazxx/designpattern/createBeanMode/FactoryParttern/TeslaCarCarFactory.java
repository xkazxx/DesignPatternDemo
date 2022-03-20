package com.xkazxx.designpattern.createBeanMode.FactoryParttern;

import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.TeslaCar;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Tire;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:17
 **/
public class TeslaCarCarFactory implements CarFactoryMethod, AbstractCarFactory {
	@Override
	public Car getCar() {
		return new TeslaCar("特斯拉", "Mode Y", 220000.0);
	}

	@Override
	public Tire getTire() {
		return new Tire("轮胎", "朝阳轮胎", 500.0);
	}
}

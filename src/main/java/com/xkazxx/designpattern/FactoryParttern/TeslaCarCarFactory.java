package com.xkazxx.designpattern.FactoryParttern;

import com.xkazxx.designpattern.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.FactoryParttern.bean.TeslaCar;
import com.xkazxx.designpattern.FactoryParttern.bean.Tire;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:17
 **/
public class TeslaCarCarFactory implements CarFactoryMethod, AbstractCarFactory {
	@Override
	public Car getCar() {
		TeslaCar teslaCar = new TeslaCar();
		teslaCar.setName("特斯拉");
		teslaCar.setCarType("Mode Y");
		teslaCar.setPrice(220000.0);
		return teslaCar;
	}

	@Override
	public Tire getTire() {
		return new Tire("轮胎", "朝阳轮胎", 500.0);
	}
}

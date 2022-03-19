package com.xkazxx.designpattern.FactoryParttern;

import com.xkazxx.designpattern.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.FactoryParttern.bean.TeslaCar;
import com.xkazxx.designpattern.FactoryParttern.bean.WULinCar;

/**
 * 简单工厂， 当有新的车品牌加入时，必须要修改这个工厂类才能获取到新的车对象，
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:03
 **/
public class CarSimpleFactory {

	public static Car getCar(String carType) {
		switch (carType) {
			case "五菱":
				return getWuLin();
			case "特斯拉":
				return getTesla();
			default:
				return null;
		}

	}

	public static Car getTesla() {
		return new TeslaCar("特斯拉", "Mode Y", 220000.0);
	}

	public static Car getWuLin() {
		return new WULinCar("五菱mini", "五菱宏光", 42000.0);
	}
}

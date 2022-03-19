package com.xkazxx.designpattern.FactoryParttern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:04
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class WULinCar extends Car implements CarFunction{

	public WULinCar() {
		super();
	}

	public WULinCar(String carType, String name, Double price) {
		super(carType, name, price);
	}

	@Override
	public void drive() {
		System.out.println("五菱宏光开动了，呜呜呜~~~");
	}

	@Override
	public void park() {
		System.out.println("五菱宏光特斯拉开动了，呜呜呜~~~");
	}

	@Override
	public String toString() {
		return "carType=" + this.getCarType() + " name=" + this.getName() + " price="+ this.getPrice();
	}
}

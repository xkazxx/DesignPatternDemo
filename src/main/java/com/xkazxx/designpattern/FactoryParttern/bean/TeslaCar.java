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
@EqualsAndHashCode(callSuper = true)
@Data
public class TeslaCar extends Car implements CarFunction {


	public TeslaCar() {
		super();
	}

	public TeslaCar(String carType, String name, Double price) {
		super(carType, name, price);
	}

	@Override
	public void drive() {
		System.out.println("特斯拉开动了，呜呜呜~~~");
	}

	@Override
	public void park() {
		System.out.println("特斯拉停车了，呜呜呜~~");
	}

	@Override
	public String toString() {
		return "carType=" + this.getCarType() + " name=" + this.getName() + " price="+ this.getPrice();
	}
}

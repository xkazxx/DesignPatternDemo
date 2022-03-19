package com.xkazxx.designpattern.FactoryParttern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:04
 **/
@Data
@AllArgsConstructor
public class WULinCar extends Car implements CarFunction{

	@Override
	public void drive() {
		System.out.println("五菱宏光开动了，呜呜呜~~~");
	}

	@Override
	public void park() {
		System.out.println("五菱宏光特斯拉开动了，呜呜呜~~~");
	}
}

package com.xkazxx.designpattern.FactoryParttern.bean;

import lombok.*;

/**
 *
 * 定义了车的公共属性
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:01
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Car {
	private String carType;
	private String name;
	private Double price;


	@Override
	public String toString() {
		return "Car{" +
						"carType='" + carType + '\'' +
						", name='" + name + '\'' +
						", price=" + price +
						'}';
	}
}

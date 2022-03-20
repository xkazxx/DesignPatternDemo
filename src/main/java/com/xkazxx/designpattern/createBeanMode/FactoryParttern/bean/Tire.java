package com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:31
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tire implements TireFunction {
	private String tireType;
	private String name;
	private Double price;

	@Override
	public void scroll() {
		System.out.println("轮胎动起来了，呜呜呜~~~");
	}
}

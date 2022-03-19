package com.xkazxx.designpattern.FactoryParttern.bean;

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
public class Tire {
	private String tireType;
	private String name;
	private Double price;

}

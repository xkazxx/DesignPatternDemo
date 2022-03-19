package com.xkazxx.designpattern.FactoryParttern.bean;

import lombok.Data;

/**
 *  定义了车的功能
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:01
 **/
public interface CarFunction {
	void drive();
	void park();
}

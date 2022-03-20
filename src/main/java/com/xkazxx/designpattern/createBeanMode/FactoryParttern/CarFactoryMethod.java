package com.xkazxx.designpattern.createBeanMode.FactoryParttern;

import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Car;

/**
 * 工厂方法：所有的CarType工厂都实现这个工厂类，没增加一种新的车品牌就增加一个该工厂的实现类
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:15
 **/
public interface CarFactoryMethod {
	 Car getCar();

}

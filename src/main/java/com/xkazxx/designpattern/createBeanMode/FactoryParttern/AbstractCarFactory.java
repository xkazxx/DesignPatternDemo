package com.xkazxx.designpattern.createBeanMode.FactoryParttern;

import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Tire;

/**
 * 抽象工厂模式：定义具体每种汽车工厂能力，如需要扩展新的功能需要修改所有的工厂，包括抽象工厂
 * 现在汽车工厂不仅能生产汽车，还能生产轮胎，
 * 假设以后骑车工厂还要能生产座椅，就需要修改这个抽象工厂代码，并且所有继承的具体汽车工厂也都需要实现该方法
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 22:27
 **/
public interface AbstractCarFactory {
	Car getCar();
	Tire getTire();

}

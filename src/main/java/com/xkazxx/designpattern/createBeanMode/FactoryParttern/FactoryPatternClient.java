package com.xkazxx.designpattern.createBeanMode.FactoryParttern;

import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.Car;
import com.xkazxx.designpattern.createBeanMode.FactoryParttern.bean.TeslaCar;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/19 23:37
 **/
public class FactoryPatternClient {


	public static void main(String[] args) {
		testCarSimpleFactory();
		System.out.println("----------- .... ----------- .... -----------");
		testCarFactoryMethod();
		System.out.println("----------- .... ----------- .... -----------");
		testAbstractCarFactory();
	}

	public static void testCarSimpleFactory() {
		Car wuLin = CarSimpleFactory.getWuLin();
		Car tesla = CarSimpleFactory.getTesla();
		String s = wuLin.toString();
		System.out.println(wuLin);
		System.out.println(tesla);
	}

	public static void testCarFactoryMethod() {
		CarFactoryMethod factory = new WuLiCarCarFactory();
		Car car = factory.getCar();
		CarFactoryMethod factory2 = new TeslaCarCarFactory();
		TeslaCar car2 = (TeslaCar) factory2.getCar();
		System.out.println(car);
		System.out.println(car2);
	}

	public static void testAbstractCarFactory() {
		AbstractCarFactory factory = new WuLiCarCarFactory();
		Car car = factory.getCar();
		AbstractCarFactory factory2 = new TeslaCarCarFactory();
		Car car2 = factory2.getCar();
		System.out.println(car);
		System.out.println(car2);
	}
}

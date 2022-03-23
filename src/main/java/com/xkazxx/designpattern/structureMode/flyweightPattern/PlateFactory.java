package com.xkazxx.designpattern.structureMode.flyweightPattern;

import java.util.HashMap;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:59
 **/
public enum PlateFactory {
	;

	private static final HashMap<Integer, Plate> circleMap = new HashMap<>();

	public static Plate getCircle(int serialNumber) {
		Plate circle = circleMap.get(serialNumber);
		if (circle == null) {
			circle = new Plate(serialNumber);
			circleMap.put(serialNumber, circle);
			System.out.println("Creating Plate of serialNumber : " + serialNumber);
		}
		return circle;
	}

	public static void initPlate(int num){
		for (int i = 0; i < num; i++) {
			circleMap.put(i + 1, new Plate(i + 1));
		}
	}
}

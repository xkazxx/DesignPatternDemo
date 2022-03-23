package com.xkazxx.designpattern.structureMode.facadePattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:29
 **/
public class FacadePart {

	public static void process(){
		Part1.process();
		Part2.process();
		Part3.process();
	}
}

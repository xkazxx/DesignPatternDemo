package com.xkazxx.designpattern.structureMode.facadePattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:28
 **/
public class FacadePatternClient {


	public static void main(String[] args) {
	// 某个统特别复杂，实现一个功能需要多个模块调用
		Part1.process();
		Part2.process();
		Part3.process();
		System.out.println("-===================-");
		// 现在这个系统提供了一个外观模式的接待员，负责协调系统内部工作为客户提供功能，简化客户操作，隐藏内部细节
		FacadePart.process();

	}
}

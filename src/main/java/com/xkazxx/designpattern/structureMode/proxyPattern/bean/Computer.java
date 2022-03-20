package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

/**
 * 超薄电脑，没有网线接口，
 * 上网方式1：需要适配器将网线接口转换为USB接口
 * 上网方式2：通过网线代理将信息传给电脑
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:14
 **/
public class Computer {

	public void net(USBInterface usbInterface){
		System.out.println(usbInterface.getInformation());
	}

	public void net(String information){
		System.out.println(information);
	}
}

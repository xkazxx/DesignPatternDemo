package com.xkazxx.designpattern.structureMode.adapterPattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 超薄电脑，没有网线接口，需要适配器将网线接口转换为USB接口
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
	private NetWireAdapter usbInterface;

	public void net(){
		System.out.println(this.usbInterface.transmitInformation());
	}
}

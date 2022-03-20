package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NetWireProxy {
	private NetWire netWire;

	public USBInterface proxyNet(NetWire netWire) {
		// 静态代理1：生成目标类
		USBInterface usbInterface = new USBInterface();
		usbInterface.setInformation(netWire.getInformation());
		return usbInterface;
	}

	public String transmitInformation() {
		// 静态代理2：代理被代理对象功能
		return netWire.getInformation();
	}
}

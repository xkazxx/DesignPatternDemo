package com.xkazxx.designpattern.structureMode.proxyPattern;

import com.xkazxx.designpattern.structureMode.proxyPattern.bean.Computer;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.NetWire;
import com.xkazxx.designpattern.structureMode.proxyPattern.bean.NetWireProxy;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:14
 **/
public class AdapterPatternClient {

	public static void main(String[] args) {
		NetWire netWire = new NetWire();
		netWire.setInformation("start internet surfing！");

		Computer computer = new Computer();
		// 方式1：生成USB接口对象，由USB接口对象完成信息传输功能
		computer.net(new NetWireProxy().proxyNet(netWire));
		// 方式2：代理完成NetWire传输信息的功能
		computer.net(new NetWireProxy(netWire).transmitInformation());
	}
}

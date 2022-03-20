package com.xkazxx.designpattern.structureMode.adapterPattern;


import com.xkazxx.designpattern.structureMode.adapterPattern.bean.Computer;
import com.xkazxx.designpattern.structureMode.adapterPattern.bean.NetWire;
import com.xkazxx.designpattern.structureMode.adapterPattern.bean.NetWireAdapter;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:14
 **/
public class AdapterPatternClient {

	public static void main(String[] args) {

		NetWire netWire = new NetWire("start internet surfing！");
		NetWireAdapter netWireAdapter = new NetWireAdapter(netWire);
		new Computer(netWireAdapter).net();
	}
}

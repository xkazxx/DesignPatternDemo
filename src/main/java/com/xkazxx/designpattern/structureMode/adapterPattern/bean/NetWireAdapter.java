package com.xkazxx.designpattern.structureMode.adapterPattern.bean;

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
public class NetWireAdapter implements NetToUSB {
	private NetWire netWire;


	public String transmitInformation() {

		return netWire.getInformation();
	}
}

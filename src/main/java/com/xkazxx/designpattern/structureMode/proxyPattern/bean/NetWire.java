package com.xkazxx.designpattern.structureMode.proxyPattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 17:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetWire {

	private String information;

	public String transmitInformation() {
		return information;
	}
}

package com.xkazxx.designpattern.behaviorMode.chainOfRespPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 22:15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestContext {

	protected String message;
	protected String from;
	protected String target;


}

package com.xkazxx.designpattern.behaviorMode.chainOfRespPattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 22:13
 **/
public class ChainOfRespPatternClient {


	public static void main(String[] args) {
		InformationChannel channel = new InformationChannel();
		channel.addFilter(new FromChainFilter());
		channel.addFilter(new MessageChainFilter());
		channel.addFilter(new TargetChainFilter());

		channel.sendRequest(new RequestContext("你好", "张三", "李四"));
		System.out.println();
		channel.sendRequest(new RequestContext("你好", "张三", "王五"));
		System.out.println();
		channel.sendRequest(new RequestContext("你好", "李四", "张三"));
		System.out.println();
		channel.sendRequest(new RequestContext("你好", "李四", "王五"));
		System.out.println();
		channel.sendRequest(new RequestContext("违法、有害、低俗信息", "李四", "王五"));
		System.out.println();
		channel.sendRequest(new RequestContext("违法、有害、低俗信息", "李四", "王五"));
		System.out.println();
		channel.sendRequest(new RequestContext("违法、有害、低俗信息", "王五", "赵六"));
	}
}

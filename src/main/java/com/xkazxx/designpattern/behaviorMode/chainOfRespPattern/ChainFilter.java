package com.xkazxx.designpattern.behaviorMode.chainOfRespPattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 22:14
 **/
public interface ChainFilter {


	boolean doFilter(RequestContext context);
}

class MessageChainFilter implements ChainFilter {

	@Override
	public boolean doFilter(RequestContext context) {
		String message = context.getMessage();
		if (message == null || message.trim().length() == 0 || "违法、有害、低俗信息".equals(message)) {
			System.out.println("系统检测到你发送的消息不符合规范！！");
			return false;
		}
		return true;
	}
}

class FromChainFilter implements ChainFilter {

	@Override
	public boolean doFilter(RequestContext context) {
		String header = context.getFrom();
		if (header == null || header.trim().length() == 0 || !"张三".equals(header)) {
			System.out.println("系统检测到你的账号被封禁，无法发送消息");
			return false;
		}
		return true;
	}
}
class TargetChainFilter implements ChainFilter {

	@Override
	public boolean doFilter(RequestContext context) {
		String target = context.getTarget();
		if (target == null || target.trim().length() == 0 || "李四".equals(target)) {
			System.out.println("系统检测到发送的对象不存在或者处于封禁状态！！");
			return false;
		}
		return true;
	}
}
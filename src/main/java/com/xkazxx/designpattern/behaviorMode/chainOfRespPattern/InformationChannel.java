package com.xkazxx.designpattern.behaviorMode.chainOfRespPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 22:25
 **/
public class InformationChannel {

	private final List<ChainFilter> chainFilters;

	public InformationChannel() {
		this.chainFilters = new ArrayList<>();
	}

	public void addFilter(ChainFilter filter) {
		chainFilters.add(filter);
	}

	public void removeFilter(ChainFilter filter) {
		chainFilters.remove(filter);
	}

	public boolean sendRequest(RequestContext requestContext) {
		for (ChainFilter chainFilter : chainFilters) {
			if (!chainFilter.doFilter(requestContext)) {
				return false;
			}
		}
		System.out.println("[" + requestContext.getFrom() + "]发送给[" + requestContext.getTarget() + "]的消息[" + requestContext.getMessage() + "]成功送达");
		return true;
	}
}

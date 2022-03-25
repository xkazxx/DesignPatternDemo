package com.xkazxx.designpattern.behaviorMode.visitorPattern;

import lombok.Data;

import java.util.Random;

/**
 * 被访问的对象，需要在目前的功能上添加新的功能（访问者来实现）
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 23:12
 **/
@Data
public abstract class Staff {
	protected String name;
	protected int kpi;

	public Staff(String name, int kpi) {
		this.name = name;
		this.kpi = kpi;
	}

	protected abstract void accept(IVisitor visitor);
}


class Engineer extends Staff {

	public Engineer(String name, int kpi) {
		super(name, kpi);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public int getCodeLines() {
		return new Random().nextInt(12000);
	}
}


class Manager extends Staff {


	public Manager(String name, int kpi) {
		super(name, kpi);
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public int getProducts() {
		return new Random().nextInt(12000);
	}
}

package com.xkazxx.designpattern.behaviorMode.visitorPattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 23:14
 **/
public interface IVisitor {

	void visit(Manager manager);

	void visit(Engineer engineer);
}

class CTOVisitor implements IVisitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
	}
}

class CEOVisitor implements IVisitor {
	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
						", 新产品数量: " + manager.getProducts());
	}
}
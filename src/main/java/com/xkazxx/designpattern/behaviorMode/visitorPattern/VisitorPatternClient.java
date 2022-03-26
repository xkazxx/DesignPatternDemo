package com.xkazxx.designpattern.behaviorMode.visitorPattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 23:09
 **/
public class VisitorPatternClient {

	/**
	 * 年底，CEO和CTO开始评定员工一年的工作绩效，员工分为工程师和经理(适用于员工种类不会变化的情况，如果新增员工类型，就需要修改所有的visitor)
	 * CEO关注的是工程师的KPI和经理的KPI以及新产品数量。
	 * CTO关注工程师的代码量、经理的新产品数量；
	 */
	public static void main(String[] args) {

		
		BusinessReport businessReport = new BusinessReport();
		// accept 模拟员工入职
		Manager manager1 = new Manager("经理-A", 10);
		Manager manager2 = new Manager("经理-B", 12);
		Engineer engineer1 = new Engineer("工程师-A", 10000);
		Engineer engineer2 = new Engineer("工程师-B", 12000);
		Engineer engineer3 = new Engineer("工程师-C", 11000);
		Engineer engineer4 = new Engineer("工程师-D", 13000);
		businessReport.accept(manager1);
		businessReport.accept(manager2);
		businessReport.accept(engineer1);
		businessReport.accept(engineer2);
		businessReport.accept(engineer3);
		businessReport.accept(engineer4);
		System.out.println("==========CEO========");
		businessReport.showReport(new CEOVisitor());
		System.out.println("==========CTO========");
		businessReport.showReport(new CTOVisitor());

		// remove 模拟员工离职
		businessReport.remove(engineer3);
		businessReport.remove(engineer2);
		businessReport.remove(engineer1);
		businessReport.remove(manager1);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("==========CEO========");
		businessReport.showReport(new CEOVisitor());
		System.out.println("==========CTO========");
		businessReport.showReport(new CTOVisitor());

	}
}

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
		System.out.println("==========CEO========");
		businessReport.showReport(new CEOVisitor());
		System.out.println("==========CTO========");
		businessReport.showReport(new CTOVisitor());

	}
}

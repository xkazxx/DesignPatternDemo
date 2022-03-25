package com.xkazxx.designpattern.behaviorMode.visitorPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * 员工业务报表类
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/25 23:28
 **/
public class BusinessReport {

	private final List<Staff> mStaffs = new LinkedList<>();

	public BusinessReport() {
		mStaffs.add(new Manager("经理-A", 10));
		mStaffs.add(new Engineer("工程师-A", 10000));
		mStaffs.add(new Engineer("工程师-B", 12000));
		mStaffs.add(new Engineer("工程师-C", 11000));
		mStaffs.add(new Manager("经理-B", 12));
		mStaffs.add(new Engineer("工程师-D", 13000));
	}

	/**
	 * 为访问者展示报表
	 *
	 * @param visitor 公司高层，如CEO、CTO
	 */
	public void showReport(IVisitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
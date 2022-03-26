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

	private final List<Staff> mStaffs;

	public BusinessReport() {
		mStaffs = new LinkedList<>();
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

	public void accept(Staff staff) {
		mStaffs.add(staff);
	}

	public void remove(Staff staff) {
		mStaffs.remove(staff);
	}
}
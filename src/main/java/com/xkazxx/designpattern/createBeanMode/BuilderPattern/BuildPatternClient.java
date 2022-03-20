package com.xkazxx.designpattern.createBeanMode.BuilderPattern;

import com.xkazxx.designpattern.createBeanMode.BuilderPattern.bean.Phone;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 0:03
 **/
public class BuildPatternClient {


	public static void main(String[] args) {
		// 默认产品
		Phone phone = Phone.start().build();
		System.out.println(phone);

		// 用户自定义产品
		Phone phone2 = Phone.start().camera("哈苏").process("高通").scree("京东方").type("小米").build();
		System.out.println(phone2);

	}
}

package com.xkazxx.designpattern.prototypePattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 所有的基础数据类型及其包装类 + string 默认的clone方法都是深拷贝
 * 数组、集合和其他自定义的应用类型 都是浅拷贝（可以用addAll()、putAll()来实现深拷贝）
 *
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 11:10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Airplane implements Cloneable, Serializable {
	private static final long serialVersionUID = -2945706673138485377L;

	private String name;
	private int capacity;
	private Double price;
	private List<Engine> engines;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = super.clone();
		Airplane airplane = (Airplane) clone;
		if (this.engines != null) {
			List<Engine> list = new ArrayList<>();
			for (Engine engine : this.engines) {
				list.add((Engine) engine.clone());
			}
//			list.addAll(this.engines);
			airplane.setEngines(list);
		}
		return clone;
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	public static class Engine implements Cloneable, Serializable {
		private static final long serialVersionUID = -1648747798695943678L;

		private String name;
		private Double price;
		private Integer power;

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}
}

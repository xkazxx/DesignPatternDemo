package com.xkazxx.designpattern.BuilderPattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 0:04
 **/
@Data
@AllArgsConstructor
public class Phone {
	private String type;
	private String scree;
	private String camera;
	private String process;


	public static Builder start() {
		return new Builder();
	}


	public static class Builder {
		private final Phone phone;

		public Builder type(String type) {
			this.phone.setType(type);
			return this;
		}

		public Builder scree(String scree) {
			this.phone.setScree(scree);
			return this;
		}

		public Builder camera(String camera) {
			this.phone.setCamera(camera);
			return this;
		}

		public Builder process(String process) {
			this.phone.setProcess(process);
			return this;
		}

		public Phone build() {
			return phone;
		}

		public Builder() {
			phone = new Phone("华为", "京东方", "莱卡","麒麟9000");
		}
	}
}



package com.xkazxx.designpattern.structureMode.compositePattern;

import lombok.Data;

/**
 * 文件和文件夹组合对象(类似于二叉树的Node节点)
 * 拥有文件夹的相关功能，也拥有具体的文件对象
 *
 *  @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:01
 **/
@Data
public abstract class FileComposite {
	private String  name;

	public FileComposite(String name) {
		this.name = name;
	}

	public abstract void add(FileComposite fileComposite); // 文件加可以放文件或者文件夹
	public abstract void remove(FileComposite fileComposite); // 文件加可以放文件或者文件夹
}

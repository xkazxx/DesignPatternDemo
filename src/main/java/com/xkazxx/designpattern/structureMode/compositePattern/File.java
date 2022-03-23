package com.xkazxx.designpattern.structureMode.compositePattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:09
 **/
public abstract class File extends FileComposite {

	public File(String name) {
		super(name);
	}

	@Override
	public void add(FileComposite fileComposite) {
		throw new IllegalStateException("文件没有添加其他文件的功能！");
	}

	@Override
	public void remove(FileComposite fileComposite) {
		throw new IllegalStateException("文件没有删除其他文件的功能！");
	}
}

class ImageFile extends File {
	public ImageFile(String name) {
		super(name);
	}

}

class TextFile extends File {
	public TextFile(String name) {
		super(name);
	}

}


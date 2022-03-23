package com.xkazxx.designpattern.structureMode.compositePattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:05
 **/
@Data
public class FileFolder extends FileComposite {
	private List<FileComposite> fileComposites;

	public FileFolder(String name) {
		super(name);
		this.fileComposites = new ArrayList<>();
	}

	@Override
	public void add(FileComposite fileComposite) {
		fileComposites.add(fileComposite);
	}

	@Override
	public void remove(FileComposite fileComposite) {
		fileComposite.remove(fileComposite);
	}
}

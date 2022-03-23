package com.xkazxx.designpattern.structureMode.compositePattern;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/23 22:00
 **/
public class CompositePatternClient {

	public static void main(String[] args) {
		FileFolder root = new FileFolder("root-根目录");

		FileFolder folderTow = new FileFolder("第二层文件夹");
		ImageFile imageFile = new ImageFile("图片1");
		root.add(folderTow);
		root.add(imageFile);

		FileFolder folderThree = new FileFolder("第三层文件夹");
		TextFile textFile = new TextFile("文本2");
		folderTow.add(textFile);
		folderTow.add(folderThree);
		System.out.println(root);
	}
}

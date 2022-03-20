package com.xkazxx.designpattern.createBeanMode.prototypePattern;

import com.xkazxx.designpattern.createBeanMode.prototypePattern.bean.Airplane;

import java.io.*;
import java.util.Arrays;

/**
 * @version v0.1
 * @author: created by xkazxx
 * @description: description
 * @date: 2022/3/20 11:09
 **/
public class PrototypePatternClient {


	public static void main(String[] args) throws CloneNotSupportedException {
		Airplane prototypePlain = new Airplane(
						"重型运载火箭",
						500,
						160000000D,
						Arrays.asList(new Airplane.Engine("固体发动机", 5600000D, 2700), new Airplane.Engine("液体发动机", 6600000D, 2900)));
		System.out.println(prototypePlain);

		// 原型模式一：clone
		Airplane clonePlain = (Airplane) prototypePlain.clone();
		System.out.println(clonePlain);

		// 原型模式2：Serializable
		ObjectInputStream ois = null;
		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				 ObjectOutputStream oos = new ObjectOutputStream(out)) {
			oos.writeObject(prototypePlain);
			ois = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
			Airplane serializablePlane = (Airplane) ois.readObject();
			System.out.println(serializablePlane);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

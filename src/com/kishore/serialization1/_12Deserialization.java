package com.kishore.serialization1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _12Deserialization {

	public static void main(String args[]) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ZExamples\\kishore.ser1"));

		_11Serialization s = (_11Serialization) ois.readObject();
		System.out.println(s.i);

	}
}

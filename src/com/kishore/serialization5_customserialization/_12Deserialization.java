package com.kishore.serialization5_customserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _12Deserialization {
	public static void main(String args[]) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ZExamples\\kishore.ser5"));

		MainClass ref = (MainClass) ois.readObject();

		System.out.println(ref.userName);
		System.out.println(ref.password1);
		System.out.println(ref.password2);
		System.out.println(ref.epin);

	}
}

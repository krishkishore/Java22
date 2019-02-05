package com.kishore.serialization7_externalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _12Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser6");
		ObjectInputStream oos = new ObjectInputStream(fis);
		ExternalizationClass ref = (ExternalizationClass) oos.readObject();
		System.out.println(ref.s);
		System.out.println(ref.i);
		System.out.println(ref.j);

	}
}

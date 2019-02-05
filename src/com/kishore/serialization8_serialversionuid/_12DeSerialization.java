package com.kishore.serialization8_serialversionuid;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class _12DeSerialization {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser8");
		ObjectInputStream ois = new ObjectInputStream(fis);
		FieldClass ref = (FieldClass) ois.readObject();
		System.out.println(ref.i);
		System.out.println(ref.j);
	}
}

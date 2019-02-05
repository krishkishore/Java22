package com.kishore.serialization8_serialversionuid;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class _11Serialization {
	public static void main(String[] args) throws Exception {

		FieldClass ref = new FieldClass();

		FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser8");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ref);

	}
}

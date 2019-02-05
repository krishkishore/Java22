package com.kishore.serialization7_externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _11Externalization {
	public static void main(String[] args) throws IOException {

		ExternalizationClass ref = new ExternalizationClass("Kishore", 20, 20);

		FileOutputStream fis = new FileOutputStream("D:\\ZExamples\\kishore.ser6");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(ref);

	}
}

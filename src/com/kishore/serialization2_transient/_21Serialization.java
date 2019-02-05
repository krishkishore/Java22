package com.kishore.serialization2_transient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _21Serialization implements Serializable {

	int a = 10;
	int b = 20;

	transient int c = 10;
	int d = 20;

	transient static int e = 10;
	transient int f = 20;

	transient int g = 10;
	transient final int h = 20;

	transient static int i = 10;
	transient static int j = 20;

	public static void main(String[] args) {

		_21Serialization ref = new _21Serialization();

		try (FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser2");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(ref);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}

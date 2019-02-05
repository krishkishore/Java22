package com.kishore.serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _11Serialization implements Serializable {

	int i = 10;

	public static void main(String[] args) throws IOException {
		_11Serialization obj = new _11Serialization();
		obj.i = 30;

		try {
			FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser1");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);

			fos.close();
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

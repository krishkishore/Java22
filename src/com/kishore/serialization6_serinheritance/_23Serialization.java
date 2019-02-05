package com.kishore.serialization6_serinheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _23Serialization {

	public static void main(String[] args) {

		_22FieldClass ref = new _22FieldClass();
		ref.i = 123;
		ref.j = 321;

		try (FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser6");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(ref);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

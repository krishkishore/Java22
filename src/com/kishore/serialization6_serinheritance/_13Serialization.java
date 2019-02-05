package com.kishore.serialization6_serinheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _13Serialization {

	public static void main(String[] args) {

		_12FieldClass2 ref = new _12FieldClass2();

		try (FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser6");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(ref);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}

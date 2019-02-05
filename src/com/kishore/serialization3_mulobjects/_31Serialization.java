package com.kishore.serialization3_mulobjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _31Serialization {
	public static void main(String[] args) {

		FieldClass1 fc1 = new FieldClass1();
		FieldClass2 fc2 = new FieldClass2();
		FieldClass3 fc3 = new FieldClass3();

		try (FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser3");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(fc1);
			oos.writeObject(fc2);
			oos.writeObject(fc3);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

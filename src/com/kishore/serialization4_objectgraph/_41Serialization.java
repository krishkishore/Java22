package com.kishore.serialization4_objectgraph;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _41Serialization {
	public static void main(String[] args) {

		FieldClass1 fc1 = new FieldClass1();

		try (FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser4");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(fc1);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

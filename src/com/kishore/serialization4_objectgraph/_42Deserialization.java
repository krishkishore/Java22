package com.kishore.serialization4_objectgraph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _42Deserialization {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser4");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			FieldClass1 fc1 = (FieldClass1) ois.readObject();

			System.out.println(fc1.fc2.fc3.c);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

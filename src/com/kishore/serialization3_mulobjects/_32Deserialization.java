package com.kishore.serialization3_mulobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _32Deserialization {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser3");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Object obj1 = ois.readObject();
			FieldClass1 fc1 = (FieldClass1) obj1;

			Object obj2 = ois.readObject();
			FieldClass2 fc2 = (FieldClass2) obj2;

			FieldClass3 fc3 = (FieldClass3) ois.readObject();

			System.out.println(fc1.i);
			System.out.println(fc2.f);
			System.out.println(fc3.c);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

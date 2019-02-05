package com.kishore.serialization3_mulobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _33Deserialization {
	public static void main(String[] args) {

		// If we don't know the order of objects serilized
		try (FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser3");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			int i = 1;
			while (i <= 3) {
				Object obj = ois.readObject();

				if (obj instanceof FieldClass1) {
					FieldClass1 fc1 = (FieldClass1) obj;
					System.out.println(fc1.i);
				} else if (obj instanceof FieldClass2) {
					FieldClass2 fc2 = (FieldClass2) obj;
					System.out.println(fc2.f);
				} else if (obj instanceof FieldClass3) {
					FieldClass3 fc3 = (FieldClass3) obj;
					System.out.println(fc3.c);
				}
				i++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

package com.kishore.serialization6_serinheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _24DeSerialization {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser6");
				ObjectInputStream oos = new ObjectInputStream(fis)) {

			_22FieldClass ref = (_22FieldClass) oos.readObject();
			System.out.println(ref.i);
			System.out.println(ref.j);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

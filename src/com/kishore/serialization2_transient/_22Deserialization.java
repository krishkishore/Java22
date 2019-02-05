package com.kishore.serialization2_transient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _22Deserialization {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\ZExamples\\kishore.ser2");
				ObjectInputStream oos = new ObjectInputStream(fis)) {

			_21Serialization ref = (_21Serialization) oos.readObject();

			System.out.println(ref.a);
			System.out.println(ref.b);

			System.out.println(ref.c);
			System.out.println(ref.d);

			System.out.println(ref.e);
			System.out.println(ref.f);

			System.out.println(ref.g);
			System.out.println(ref.h);

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

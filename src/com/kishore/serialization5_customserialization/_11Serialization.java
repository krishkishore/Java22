package com.kishore.serialization5_customserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _11Serialization {
	public static void main(String[] args) throws IOException {

		MainClass ref = new MainClass();

		try {
			FileOutputStream fos = new FileOutputStream("D:\\ZExamples\\kishore.ser5");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ref);

			fos.close();
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

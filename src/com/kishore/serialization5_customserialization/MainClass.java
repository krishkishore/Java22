package com.kishore.serialization5_customserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass implements Serializable {

	String userName = "Kishore";
	transient String password1 = "krish";
	transient String password2 = "kishorekrish";
	transient int epin = 1234;

	// Additional Work
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();

		final String encryptedPassword1 = "123" + password1;
		oos.writeObject(encryptedPassword1);

		final String encryptedPassword2 = "123" + password2;
		oos.writeObject(encryptedPassword2);

		final int encryptedEPIN = epin + 123;
		oos.writeInt(encryptedEPIN);

	}

	// Additional Work
	private void readObject(ObjectInputStream ios) throws IOException, ClassNotFoundException {
		ios.defaultReadObject();

		String decryptedPassword1 = (String) ios.readObject();
		password1 = decryptedPassword1.substring(3);

		String decryptedPassword2 = (String) ios.readObject();
		password2 = decryptedPassword2.substring(3);

		int decryptedEPIN = ios.readInt();
		epin = decryptedEPIN - 123;
	}

}

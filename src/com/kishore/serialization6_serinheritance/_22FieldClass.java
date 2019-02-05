package com.kishore.serialization6_serinheritance;

import java.io.Serializable;

public class _22FieldClass extends _21FieldClass implements Serializable {

	_22FieldClass() {
		System.out.println("Second Class Constructor");
	}

	int j = 20;
}

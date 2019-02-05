package com.kishore.serialization4_objectgraph;

import java.io.Serializable;

public class FieldClass1 implements Serializable {
	FieldClass2 fc2 = new FieldClass2();
}

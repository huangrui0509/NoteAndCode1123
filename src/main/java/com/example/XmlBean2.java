package com.example;

import java.io.Serializable;

public class XmlBean2 implements Serializable {

	private static final long serialVersionUID = 8892889680261721690L;

	private String name;

	public String getName() {
		return name;
	}

	public XmlBean2(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "XmlBean2 [name=" + name + "]";
	}
	

}

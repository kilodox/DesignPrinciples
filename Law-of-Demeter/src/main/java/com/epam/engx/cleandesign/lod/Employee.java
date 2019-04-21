package com.epam.engx.cleandesign.lod;

public class Employee {
	String id;
	String name;

	public Employee(String id) {
		this.id = id;
		this.name = "Name" + NameFormatter.DELIMITER + this.id;
	}

	public String getName() {
		return this.name;
	}

}

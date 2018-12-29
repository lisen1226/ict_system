package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class ExaminationType {
	private int id;
	private String typeNumber;
	private String typeName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeNumber() {
		return typeNumber;
	}

	public void setTypeNumber(String typeNumber) {
		this.typeNumber = typeNumber;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}

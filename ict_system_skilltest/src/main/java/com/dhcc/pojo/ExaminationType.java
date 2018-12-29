package com.dhcc.pojo;

/**
 * 试题类型（JAVA题、C语言题）
 * 
 * @author 刘兆辉
 *
 */
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

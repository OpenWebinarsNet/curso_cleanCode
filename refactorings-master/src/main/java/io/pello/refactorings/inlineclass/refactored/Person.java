package io.pello.refactorings.inlineclass.refactored;

import java.util.Date;

/**
* Refactored version
*/
public class Person {
	private String name;
	private Date birth;
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	private int sex;

	
	public Person(String name, Date birth, int sexCode) {
		this.name = name;
		this.birth = birth;
		this.sex = sexCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}

	
}

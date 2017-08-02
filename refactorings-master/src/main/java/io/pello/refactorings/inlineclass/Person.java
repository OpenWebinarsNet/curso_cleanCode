package io.pello.refactorings.inlineclass;

import java.util.Date;

/**
 * Inline class
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Person {
	private String name;
	private Date birth;
	private Sex sex;
	
	public Person(String name, Date birth, int sexCode) {
		this.name = name;
		this.birth = birth;
		this.sex = new Sex(sexCode);
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

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}
	
}

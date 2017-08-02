package io.pello.refactorings.inlineclass;

public class Sex {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	private int sex;

	public Sex (int sex) {
		this.sex = sex;
	}

	public int getSex () {
		return sex;
	}

	@Override
	public String toString() {
		return Integer.toString(sex);
	}
}

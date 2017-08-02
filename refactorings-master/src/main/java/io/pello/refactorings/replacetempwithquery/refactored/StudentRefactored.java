package io.pello.refactorings.replacetempwithquery.refactored;

/**
 * Refactored version
 */
public class StudentRefactored {
	private String name;
	private boolean hasGoodAttitude;

	public StudentRefactored(String name, boolean hasGoodAttitude) {
		this.name = name;
		this.hasGoodAttitude = hasGoodAttitude;
	}

	public float calculateAverage(float homework, float exam) {
		if (hasGoodAttitude) {
			return mark(homework, exam) + 1;
		} else {
			return mark(homework, exam);
		}
	}

	private float mark(float homework, float exam) {
		return (homework + exam) / 2;
	}
}

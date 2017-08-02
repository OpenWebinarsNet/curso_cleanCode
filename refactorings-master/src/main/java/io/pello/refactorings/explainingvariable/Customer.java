package io.pello.refactorings.explainingvariable;

/**
 * Introduce explaining variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
class Customer {
	private String name;
	private int age;
	private float salary;
	
	public Customer(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public float applyDiscount (float totalAmount) {
		 if ((age > 17 && age < 66) && (salary - (salary * 0.2f)) < 1000f && totalAmount * 0.5 < 100) {
			return totalAmount * 0.9f;
		 } else {
			return totalAmount;
		 }
		}

}

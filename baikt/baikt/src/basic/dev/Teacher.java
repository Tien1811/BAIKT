package basic.dev;

class Teacher extends Person {

	float salaryFactor;

	public Teacher(String name, int age, float salaryFactor) {
		super(name, age);
		this.salaryFactor = salaryFactor;
	}

	public float getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(float newSalaryFactor) {
		this.salaryFactor = newSalaryFactor;
	}

	public float calculateSalary() {
		return 1800000 * salaryFactor;
	}
}

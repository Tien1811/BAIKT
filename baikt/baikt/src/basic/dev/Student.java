package basic.dev;

class Student extends Person {
	// Thuộc tính
	double mathScore;
	double physicsScore;
	double chemistryScore;

	public Student(String name, int age, double mathScore2, double physicsScore2, double chemistryScore2) {
		super(name, age);
		this.mathScore = mathScore2;
		this.physicsScore = physicsScore2;
		this.chemistryScore = chemistryScore2;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(float newMathScore) {
		this.mathScore = newMathScore;
	}

	public double getPhysicsScore() {
		return physicsScore;
	}

	public void setPhysicsScore(float newPhysicsScore) {
		this.physicsScore = newPhysicsScore;
	}

	public double getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(float newChemistryScore) {
		this.chemistryScore = newChemistryScore;
	}

	public double getAverageScore() {
		return (mathScore + physicsScore + chemistryScore) / 3;
	}
}

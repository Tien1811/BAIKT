package basic.dev;

import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        input(persons);
        print(persons);
    }

    public static void input(Person[] persons) {
        Scanner sc = new Scanner(System.in);
	for (int i = 0; i < persons.length; i++) {
		if (i < 2) {
			System.out.println("Giáo viên thứ " + (i + 1) + ":" + persons[i]);
			System.out.print("Nhập name: ");
			String name = sc.nextLine();
			System.out.print("Nhập age: ");
			int age = sc.nextInt();
			System.out.print("Nhập hệ số lương: ");
			int hesoluong = sc.nextInt();
			persons[i] = new Teacher(name, age, hesoluong);
		} else if (i < 3) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			System.out.print("Nhập name: ");
			String name = sc.nextLine();
			System.out.print("Nhập age: ");
			int age = sc.nextInt();
			System.out.print("Nhập điểm toán: ");
			double mathScore = sc.nextDouble();
			System.out.print("Nhập điểm lý: ");
			double physicsScore = sc.nextDouble();
			System.out.print("Nhập điểm hoá: ");
			double chemistryScore= sc.nextDouble();
			persons[i] = new Student(name, age, mathScore, physicsScore, chemistryScore);
        }
	}
}

public static void print(Person[] persons) {
	for (Person person : persons) {
	
		if (person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			System.out.println("Nhập name: " + teacher.getName() + "\nNhập age: " + teacher.age + "\nNhập Hệ số lương: "
					+ teacher.salaryFactor);
			System.out.println("Tính Lương: " + teacher.salaryFactor);
		} else if (person instanceof Student) {
			Student student = (Student) person;
			System.out.println("Nhập name: " + student.name + "\nNhập age: " + student.age + "\nNhập điểm toán: "
					+ student.mathScore + "\nNhập điểm lý: " + student.physicsScore + "\nNhập điểm hoá: " + student.chemistryScore);
			System.out.println("tính điểm trung bình: " + student.getAverageScore());
		}
	}
	
}
}
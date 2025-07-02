package Ren2_33;

class Person {
	
	public static int count = 0;
	public String firstName;
	public int age;
	double height;
	double weight;
	private String lastName;

	public Person(String firstName, int age, double height, double weight) {
		this.firstName = firstName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	}
	
	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	public double BMI() {
		return this.weight / this.height / this.height;
	}

//	public static void printCount() {
//		System.out.println("合計" + person.count + "人です");
//	}
}

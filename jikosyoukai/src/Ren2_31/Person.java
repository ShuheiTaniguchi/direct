package Ren2_31;

public class Person {

	String name;
	int age;
	double height;
	double weight;
	static int count = 0;

	Person(String name,int age,double height,double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
	public double bmi() {
		return weight/Math.pow(height,2);
	}
	
	public void print() {
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println("名前は" + this.name + "です");
			System.out.println("年は" + this.age + "歳です");
			System.out.println("BMIは" + (int)this.bmi() + "です");
			System.out.println(count + "人です"); 
		}
		
	}
}

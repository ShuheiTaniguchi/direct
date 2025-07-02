package Ren2_32;

public class Person {
	
	String name;
	int age;
	double height;
	double weight;
	int count = 0;

	Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	 public double BMI(){
		return this.weight / this.height / this.height;
	 }

	 public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	 }
	 
	 public void printCount() {
		System.out.println("合計" + this.count + "人です");
	 }
}

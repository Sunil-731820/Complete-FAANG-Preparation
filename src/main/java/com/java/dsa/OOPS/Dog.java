package com.java.dsa.OOPS;

public class Dog {
	private String name;
	private String bread;
	private int age;
	private String color;
	public Dog(String name, String bread, int age, String color) {
		super();
		this.name = name;
		this.bread = bread;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", bread=" + bread + ", age=" + age + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("This is The EXample of the Getter And Setter Value for Dog class:");
		Dog d1 = new Dog("Sheru", "Soya", 10, "White");
		System.out.println("The Dog d1 is : =");
		System.out.println(d1);
		System.out.println("The Dog d1 is in String format is :=");
		System.out.println(d1.toString());
	}

}

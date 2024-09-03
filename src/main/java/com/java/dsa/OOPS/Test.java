package com.java.dsa.OOPS;


abstract class Shape{
	String color;
	abstract double area();
	
	public abstract String toString();

	public Shape(String color) {
		super();
		System.out.println("java COnstructor is getting Called :");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}


class Circle extends Shape{
	double radius ;
	public Circle(String color,double radius) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	@Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
            + "and area is : " + area();
    }
	
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}

public class Test {
	public static void main(String[] args) {
		System.out.println("this is The use of The Abstract Class In java With Beautiful Examples :");
		
		Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
	}

}

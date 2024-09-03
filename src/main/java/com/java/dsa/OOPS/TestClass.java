package com.java.dsa.OOPS;

public class TestClass {
	
	public static int i = 0;

	public TestClass() {
		super();
		// TODO Auto-generated constructor stub
		
		i++;
	}
	
	public static int  get() {
		return i;
	}
	public int m1()
    {

        // Display message only
        System.out.println(
            "Inside the method m1 by object of GFG class");

        // Calling m2() method within the same class.
        this.m2();

        // Statements to be executed if any
        return 1;
    }

    // Method 3
    // Returns nothing
    public void m2()
    {

        // Print statement
        System.out.println(
            "In method m2 came from method m1");
    }
    
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of above class inside the class
    	TestClass obj = new TestClass();

        // Calling method 2 inside main() method
        int i = obj.m1();

        // Display message only
        System.out.println(
            "Control returned after method m1 :" + i);

        // Call m2() method
        // obj.m2();
        int no_of_objects = TestClass.get();

        // Print statement
        System.out.print(
            "No of instances created till now : ");

        System.out.println(no_of_objects);
    }
	

}

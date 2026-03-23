package com.java.Beg;

public class StudentRecordSystemUsingArray {
	public static void main(String[] args) {
		System.out.println("This is the Example of the Test Student Records System using Array Okay ..");
		
//		Creating the Array of the Student Objects okay 
		Student[] students = new Student[5];
		
//		Now Adding the Student objects one By One 
		students[0] = new Student(101, "Alice", 20, 88.5);
        students[1] = new Student(102, "Bob", 21, 76.0);
        students[2] = new Student(103, "Charlie", 19, 92.3);
        students[3] = new Student(104, "David", 22, 67.8);
        students[4] = new Student(105, "Eva", 20, 81.4);
        
//        Display the Details of the STudents okay 
        
        for(int i =0 ;i<students.length;i++) {
//        	calling the method for displaying the Object One by One 
        	students[i].display();
        }
		
//        find the Student with Highest marks
        
        Student topper = students[0];
        for(int i=1;i<students.length;i++) {
        	System.out.println("Student.marks : ="+students[i].marks + " And topper.marks value is :"+topper.marks);
        	if(students[i].marks > topper.marks) {
        		topper = students[i];
        	}
        }
        System.out.println("The Highet Student data with marks Are :");
        topper.display();
		
	}

}

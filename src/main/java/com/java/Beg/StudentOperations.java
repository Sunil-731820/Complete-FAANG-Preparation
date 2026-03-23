package com.java.Beg;

public class StudentOperations {
    Student[] students;
    int count;


//    Assigning the capacity of the Student using Array 
    public StudentOperations(int size) {
    	students = new Student[size];
    	count =0;
    }
    
//    method to display the Student Details 
    
    public void displayAll() {
    	System.out.println("calling the display All Student Details one by one :");
    	for(int i=0;i<students.length;i++) {
    		students[i].display();
    	}
    }

	public void addStudent(Student s) {
		System.out.println("Calling the Add Student method to the main method ..");
		if(count <students.length) {
			students[count++] = s;
		}
		else {
			System.out.println("The Array is full of the Student We Can not add Any more ...");
		}
	}

	public void searchByStudentId(int id) {
		// TODO Auto-generated method stub
		
	}
    
}

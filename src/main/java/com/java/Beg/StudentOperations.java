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
    	for(int i=0;i<count;i++) {
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
		System.out.println("Calling the Search Student using Student Id");
		for(int i=0;i<students.length;i++) {
			if(students[i].id==id) {
				students[i].display();
				return;
			}
		}
		System.out.println("No Student are with entered Id ");
		
		
	}

	public void searchByStudentUsername(String studentName) {
		System.out.println("Callling the Search Student using user name :");
		for(int i=0;i <count;i++) {
			if(students[i].name.equalsIgnoreCase(studentName)) {
				students[i].display();
				return;
			}
		}
		System.out.println("No Students Are found with Given User Name Okay :");
		
	}

	public void updateStudentMarksUsingStudentID(int studentId, double newMarks) {
		System.out.println("Calling the update StudentMarks using Student ID");
		for(int i=0;i<count;i++) {
			if(students[i].id ==studentId) {
				students[i].marks = newMarks;
				System.out.println("Marks Are updated Successfully Okay ");
				return;
			}
		}
		System.out.println("No Student Id is matching with Given ID");
		
	}

	public void deleteStudentDatausingStudentId(int deletedStudentId) {
		System.out.println("Calling the Delete Student Data using Student Id ");
			for(int i=0;i<count;i++) {
				if(students[i].id ==deletedStudentId) {
					for(int j=i;j<count-1;j++) {
						students[j] = students[j+1];
						students[j].display();
					}
					count--;
					System.out.println("Student Data Are Deleted Successfully from the Array List Okay");
					return;
				}
			}
			System.out.println("No Student Are found With given Id");
	}

	public void sortStudentDetailsUsingmarks() {
        for (int i = 0; i < count - 1; i++) {
        	System.out.println("Inside the 1 FOR LOOP");
            for (int j = 0; j < count - i - 1; j++) {
            	System.out.println("Inside the 2 FOR LOOP..");
                if (students[j].marks < students[j + 1].marks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    System.out.println("=====AFter Swaping the Value of the Student Details Are ======== ");
                    System.out.println(students[j].marks);
                    System.out.println("j+1 Data is :"+students[j+1]);
                    System.out.println("temp Student data is :"+temp);
                }
            }
        }
        System.out.println("Sorted by marks (descending):");
        displayAll();
    }

	public void calculateAverageMarksforStudent() {
		System.out.println("calling the calculate Average Marks for all Students ");
		double sum = 0;
		for(int i=0;i<count;i++) {
			sum +=students[i].marks;
		}
		System.out.println("the Average of the All Student Marks Are : ="+sum/count);
	}
    
}

// Question 1: Student Grades Management (Constructors and Arrays)
// Problem: Create a program to manage student data using arrays and constructors. 
// • Define a Student  class with the following attributes: 
// • Name • Roll number • Array of 5 subject marks. 
// • Use a parameterized constructor to initialize the name, roll number, and marks. 
// • Write a method calculateAverage() to compute the average marks of a student. 
// • Write a method displayDetails() to print the name, roll number, and average marks. 
// Input Sample: Name: Riya  Roll Number: 101  Marks: [80, 75, 90, 85, 88]  
// Output Sample: Name: Riya  Roll Number: 101  Average Marks: 83.6
import java.util.*;
class Student{
	String name;
	int rollno;
	int marks[] = new int[5];
	float average;
	Student(String n, int r, int m[])
	{
		name = n;
		rollno = r;
		marks = m;
	}
	void calculateAverage(){
		int total=0;
		for(int i=0;i<5;i++){
			total+=marks[i];
		}
		System.out.println(total);
		average=total/5;
	}
	void displayDetails(){
		System.out.println("Name = "+name);
		System.out.println("Rollno = "+rollno);
		System.out.println("Average = "+average);
	}
}
class ArrayConstructor{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter RollNo: ");
		int rollno=sc.nextInt();
		int marks[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter marks for subject"+i+": ");
			marks[i]=sc.nextInt();
		}	
		Student s=new Student(name,rollno,marks);
		s.calculateAverage();
		s.displayDetails();
	}
}

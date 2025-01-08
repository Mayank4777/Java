// Question 4: Sort Employee Salaries (Constructors and Arrays) Problem:
// Write a program to sort employee data based on their salaries using constructors and arrays.
// • Define an Employee class with attributes: 
// • Name • ID • Salary 
// • Use a parameterized constructor to initialize these values. 
// • Write a method to sort the employees in descending order of salary and display the sorted list.
// Input Sample: 
// Employee 1: Name: Alice, ID: 1, Salary: 55000  
// Employee 2: Name: Bob, ID: 2, Salary: 48000  
// Employee 3: Name: Clara, ID: 3, Salary: 67000  
// Output Sample: 
// Sorted Employees by Salary:  
// 1. Clara, Salary: 67000  
// 2. Alice, Salary: 55000  
// 3. Bob, Salary: 48000  
// Hint: 
// • Use an array to store multiple Employee objects. 
// • Implement a sorting algorithm (e.g., Bubble Sort or use inbuilt sorting) based on the salary attribute. 
// • Use the constructor to initialize the employee data while creating the objects.
import java.util.*;
class Employee
{
    String name;
    int id;
    int salary;
    Employee(String n,int empid,int s)
    {
        name=n;
        id=empid;
        salary=s;
    }
    void displayDetails(){
            System.out.println("Name = "+name+"\tid = "+id+"\tSalary = "+salary);
    }    
}

class EmployeeDatabase{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,id,salary;
        System.out.println("Enter how many employees:");
        n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name of employee"+(i+1)+": ");
            String name=sc.next();
            System.out.print("Enter id of employee"+(i+1)+": ");
            id=sc.nextInt();
            System.out.print("Enter salary of employee"+(i+1)+": ");
            salary=sc.nextInt();
            
            e[i]=new Employee(name,id,salary);
        }
        
        // for(int i=0;i<n;i++){
        //     e[i].displayDetails();
        // }
        
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
            if(e[i].salary>e[j].salary){
                Employee temp=e[i];
                e[i]=e[j];
                e[j]=temp;
                }
            }
        }
        System.out.println("After Sorting salary: ");
        for(int i=0;i<n;i++){
            e[i].displayDetails();
        }
    }
}
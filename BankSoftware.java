// Question 3: Bank Account Transactions (Constructors and Arrays) 
// Problem: Create a program  to track the transaction history of a bank account. 
// • Define a BankAccount class with attributes: 
// • Account holder name 
// • Account number  
// • Array of the last 5 transaction amounts (positive for deposits, negative for withdrawals). 
// • Use a parameterized constructor to initialize the account holder name and number. 
// • Write methods to: 
// • Add a new transaction to the array (replace the oldest transaction if the array is full). 
// • Calculate the current account balance. 
// • Display all transaction details and balance. 
// Input Sample: Transactions: [+2000, -500, +1000, -200, -300] 
// Output Sample: Account Holder: Rahul  Account Number: 12345  
// Transactions: [+2000, -500, +1000, -200, -300]  
// Balance: 3000  
// Hint: 
// • Use a fixed-size array for transactions. When the array is full, replace the oldest transaction using a circular index or by shifting values. 
// • Calculate the balance by summing up all values in the transaction array.
import java.util.*;
class BankAccount
{
    String accountHolder;
    int accNum;
    int transaction[]=new int[5];
    BankAccount(String name,int num,int trans[])
    {
        accountHolder=name;
        accNum=num;
        transaction=trans;
    }
    int currentBalance(){
        int total=0;
        for(int i=0;i<5;i++){
            total+=transaction[i];
        }
        return total;
    }
    void displayDetails(){
        System.out.println("Name = "+accountHolder);
        System.out.println("Account Number = "+accNum);
        for(int i=0;i<5;i++){
            System.out.println("Transaction["+i+"]: "+transaction[i]);
        }
        System.out.println("Total balace = "+currentBalance());
    }
    
}
class BankSoftware
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        int trans[]=new int[5];
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter number: ");
        num=sc.nextInt();
        for(int i=0;i<5;i++){
            System.out.println("Enter transaction: ");
            trans[i]=sc.nextInt();
        }
        BankAccount ba=new BankAccount(name,num,trans);
        ba.displayDetails();
    }
}

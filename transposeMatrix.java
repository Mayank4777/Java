// Question 2: Matrix Operations (Constructor and 2D Arrays) 
// • Problem: Create a Matrix class to perform basic operations on 2D arrays.
// • Define a parameterized constructor to initialize a matrix of size m x n with user-provided values. 
// • Write the following methods: displayMatrix() to print the matrix. 
// • transposeMatrix() to compute and display the transpose of the matrix. 
// Input Sample: Matrix: 1  2  3  4  5  6  7  8  9  
// Output Sample: Transpose of Matrix: 1  4  7  2  5  8  3  6  9  
// Hint:
// • Transposing a matrix involves swapping the rows and columns. 
// • Use nested loops: outer loop for rows and inner loop for columns. 
// • Use the constructor to initialize the matrix with user input. 
import java.util.*;
class Matrix
{
    int rows,cols;
    int array[][];
    Matrix(int m,int n)
    {
        rows=m;
        cols=n;
        array=new int[rows][cols];
    }
    void getMatrix(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter ["+i+"]["+j+"]: ");
                array[i][j]=sc.nextInt();
            }
        }
    }
    void displayMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transpose(){
        System.out.println("After Transpose Matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[j][i]+"\t");
            }
            System.out.println();
        }
    }

}
class transposeMatrix
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int m=sc.nextInt();
        System.out.println("Enter Columns: ");
        int n=sc.nextInt();
        Matrix mat=new Matrix(m,n);
        mat.getMatrix();
        mat.displayMatrix();
        mat.transpose();
    }
}
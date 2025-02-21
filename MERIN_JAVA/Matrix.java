import java.util.Scanner;
class Matrix{
  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter no of rows:");
int rows = sc.nextInt();
System.out.println("Enter no of cols:");
int cols = sc.nextInt();

  int [][] m1=new int[rows][cols];
  int [][] m2=new int[rows][cols];
  int [][] m3=new int[rows][cols];
  
  if(rows==rows && cols==cols){
  System.out.println("Enter array1 elements:");
 for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
       m1[i][j] = sc.nextInt();
      }
    }
System.out.println("Enter array2 elements:");
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
       m2[i][j] = sc.nextInt();
      }
    }
  for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
      m3[i][j]=m1[i][j] + m2[i][j];
      }
    }
    System.out.println("Sum array is:");
     for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
      System.out.print(m3[i][j] + " ");
      }
      System.out.println();
    }
  }
 }
 }
 


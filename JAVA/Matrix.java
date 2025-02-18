import java.util.Scanner;
class Matrix{
  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  int [][] m1=new int[2][2];
  int [][] m2=new int[2][2];
  int [][] m3=new int[2][2];
  
  System.out.println("Enter array1 elements:");
 for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
       m1[i][j] = sc.nextInt();
      }
    }
System.out.println("Enter array2 elements:");
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
       m2[i][j] = sc.nextInt();
      }
    }
  for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
      m3[i][j]=m1[i][j] + m2[i][j];
      }
    }
    System.out.println("Sum array is:");
     for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
      System.out.print(m3[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
 }
 

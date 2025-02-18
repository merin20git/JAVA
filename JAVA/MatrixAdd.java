class MatrixAdd{
  
  public static void main(String[] args){
  //int i,j;
  int [][] m1={
    {1,2},
    {3,4}
     };
  int [][] m2={
    {5,6},
    {7,8}
     };
  int [][] m3=new int[2][2];
  
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
  }
 }

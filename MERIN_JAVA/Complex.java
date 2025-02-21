import java.util.Scanner;
class Complex{

   public static void main(String[] args){
   int realSum,ImgSum;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the real part of complex no 1:");
   int real1=sc.nextInt();
   
   System.out.println("Enter the imaginary part of complex no 1:");
   int imaginary1=sc.nextInt();
   System.out.println("First complex no is:"+real1+"+"+imaginary1+"i");
    
   System.out.println("Enter the real part of complex no 2:");
   int real2=sc.nextInt();
   
   System.out.println("Enter the imaginary part of complex no 2:");
   int imaginary2=sc.nextInt();
   System.out.println("Second complex no is:"+real2+"+"+imaginary2+"i");
   
   realSum=real1+real2;
   ImgSum=imaginary1+imaginary2;
   
   System.out.println("sum of complex no is:"+realSum+"+"+ImgSum+"i");
  
   }
}

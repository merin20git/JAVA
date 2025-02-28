import java.util.Scanner;
class CPU{
  float price;
class Processor{
   int no_of_cores;
   String manufacturer;
 }
static class Ram{
   int memory=150;
   String manufacturer;
}
}
public class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    CPU cpu = new CPU();
    System.out.println("Enter Price: ");
    cpu.price=sc.nextFloat();
    
    CPU.Processor processor = cpu.new Processor();
    System.out.println("Enter No of cores: ");
    processor.no_of_cores=sc.nextInt();
    System.out.println("Enter Manufacturer: ");
    processor.manufacturer=sc.nextLine();
        
    CPU.Ram ram = new CPU.Ram();
    System.out.println("Enter Manufacturer: ");
    ram.manufacturer=sc.nextLine();
    
    System.out.println("Enter Memory: ");
    ram.memory=sc.nextInt();
    
    System.out.println("CPU DETAILS:-");
    System.out.println("Price: " + cpu.price);
    System.out.println("No of cores: " + processor.no_of_cores);
    System.out.println("Manufacturer: " + processor.manufacturer);
    System.out.println("Memory: " +ram.memory+"GB");
  }
}

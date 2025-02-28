class CPU{
  float price=250;
class Processor{
   int no_of_cores=10;
   String manufacturer="Intel";
 }
static class Ram{
   int memory=150;
   String manufacturer="Samsung";
}
}
public class Main {
  public static void main(String[] args) {
    CPU cpu = new CPU();
    CPU.Processor processor = cpu.new Processor();
    CPU.Ram ram = new CPU.Ram();
    System.out.println("CPU DETAILS:-");
    System.out.println("Price: " + cpu.price);
    System.out.println("No of cores: " + processor.no_of_cores);
    System.out.println("Manufacturer: " + processor.manufacturer);
    System.out.println("Memory: " +ram.memory+"GB");
  }
}

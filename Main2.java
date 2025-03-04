import java.util.Scanner;
class Employee{
int eNO;
String eName;
int eSalary;
Employee(int eNo,String eName,int eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
public void printDetails(){
System.out.println("Employee Details:");
System.out.println("ENO:"+this.eNo+",ENAME:"+this.eName+",ESALARY:"+this.eSalary);
}
}

class Main2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Employee emp[]=new Employee[3];//to declare 3 objects

for(int i=0;i<3;i++){
    System.out.println("Enter NO: ");
    int eNO=sc.nextInt();
    sc.nextLine(); 
    
    System.out.println("Enter NAME: ");
    String eName=sc.nextLine();
     
    System.out.println("Enter SECTION: ");
    String eSalary=sc.nextInt();
    sc.nextLine(); 
    emp[i]=new Employee(eNO,eName,eSalary);
}
for(int i=0;i<3;i++){
emp[i].printDetails();
}
}
}


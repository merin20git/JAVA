class Student{
String name;
int rollno;
String section;

Student(String name,int rollno,String section){//constructor
this.name=name;
this.rollno=rollno;
this.section=section;
}
public void printDetails(){
System.out.println("Student Details:");
System.out.println("NAME:"+this.name+",ROLLNO:"+this.rollno+",SECTION:"+this.section);
}
}
class Mprg{
public static void main(String[] args){
Student stud1=new Student("Merin",1,"section A");
Student stud2=new Student("Sona",2,"section B");
Student stud3=new Student("Sia",3,"section C");

stud1.printDetails();
stud2.printDetails();
stud3.printDetails();
}}


import java.util.Scanner;
class Shapes{
void display(double r)
{
double carea=3.14*r*r;
System.out.println("Area of circle is :" + carea);
}
void display(int l,int b){
 int rarea=l*b;
System.out.println("Area of rectangle is :" + rarea);
}
void display(double base,double height){
double tarea= 0.5*(base*height);
System.out.println("Area of triangle is :"+ tarea);
}
void display(int s){
int sarea=s*s;
System.out.println("Area of square is:" +sarea);
}
}
public class AreaShapes{
public static void main(String args[]){
Shapes obj = new Shapes();
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Radius:");
double r = sc.nextDouble();
obj.display(r);
System.out.print("Enter the Length:");
int l = sc.nextInt();
System.out.print("Enter the Breadth:");
int b = sc.nextInt();
obj.display(l,b);
System.out.print("Enter the base:");
double base = sc.nextDouble();
System.out.print("Enter the height:");
double height = sc.nextDouble();
obj.display(base,height);
System.out.println("Enter the side of Square:");
int s =sc.nextInt();
obj.display(s);
}
}

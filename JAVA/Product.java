class Product{
   int pcode;
   String pname;
   double price;

public static void main(String[]args){
    	Product myObj1=new Product();
    	myObj1.pcode=101;
    	myObj1.pname="Mango";
    	myObj1.price=100;
   	 
    	Product myObj2=new Product();
    	myObj2.pcode=102;
    	myObj2.pname="Orange";
    	myObj2.price=80;
   	 
    	Product myObj3=new Product();
    	myObj3.pcode=103;
    	myObj3.pname="Apple";
    	myObj3.price=90;
System.out.println("Product 1: " + myObj1.pname + ", Price: " + myObj1.price);
System.out.println("Product 2 :"+ myObj2.pname+", Price: " + myObj2.price);
System.out.println("Product 3 :"+ myObj3.pname+", Price: " + myObj3.price);
if(myObj1.price < myObj2.price && myObj1.price < myObj3.price){
System.out.println("Product 1 is lower");
}else if(myObj2.price < myObj1.price && myObj2.price < myObj3.price){
System.out.println("Product 2 is lower");
}else{
System.out.println("Product 3 is lower");
}
}}


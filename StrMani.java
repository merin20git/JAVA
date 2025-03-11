import java.util.Scanner;

public class StrMani{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter string1:");
String str1=sc.nextLine();

System.out.println("String Position:"+str1.charAt(4));
System.out.println("String Replace:"+str1.replace('m','z'));
System.out.println("String Contains:"+str1.contains("tho"));
System.out.println("String Concat:"+str1.concat(" Hello"));
System.out.println("String EndsWith:"+str1.endsWith("mas"));
System.out.println("String StartsWith:"+str1.startsWith("mer"));
System.out.println("String Substring:"+str1.substring(7,13));
System.out.println("String ToUpperCase:"+str1.toUpperCase());
System.out.println("String ToLowerCase:"+str1.toLowerCase());
System.out.println("String Trim:"+str1.trim());
System.out.print("Enter string2:");
String str2=sc.nextLine();
System.out.println("String Equal:"+str1.equals(str2));

}}

public class StrSort{
public static void main(String[] args){
String [] arr={"e","d","c","b","a"};
for(int i=0;i<arr.length-1;i++){
 for(int j=i+1;j<arr.length;j++){
  if(arr[i].compareTo(arr[j])>0){
     String temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
  }
 }
}
System.out.print("Sorted array is:");
for(int i=0;i<arr.length;i++){
System.out.print(""+arr[i]);
}
}
}

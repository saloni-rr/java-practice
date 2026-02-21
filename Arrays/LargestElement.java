import java.util.Scanner;
public class LargestElement {
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int n=sc.nextInt();
  int arr[]=new int[n];
System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      System.out.println("arr["+i+"] ="+arr[i]);
    }
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
        max=arr[i];
    }
}
System.out.println("Max element is here :"+max);
}
}

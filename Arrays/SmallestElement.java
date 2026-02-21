import java.util.Scanner;

public class SmallestElement {
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
int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    if(min>arr[i]){
        min=arr[i];
    }
}
System.out.println("Min element is here :"+min);
}

}

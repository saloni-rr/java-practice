import java.util.Scanner;

public class SecondLargest {
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
        int s_max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                s_max=max;

                max=arr[i];

            }
            else if(s_max<arr[i] && max>arr[i]){
                s_max=arr[i];
            }
        }
    System.out.println("Second Largest element is :"+s_max);
}
}
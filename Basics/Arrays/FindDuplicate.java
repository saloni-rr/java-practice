import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicate {
           public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        } 
        System.out.println("Duplicate elements :");
        for(int i:hs.keySet()){
           if(hs.get(i)!=1){
            System.out.print(i+" ");
           }
        }
    }
}

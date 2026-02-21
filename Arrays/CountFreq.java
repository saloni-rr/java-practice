import java.util.*;
public class CountFreq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            System.out.println("element :"+i+" frequency :"+map.get(i));
        }
    }
}

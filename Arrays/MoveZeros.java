public class MoveZeros{
   public static void main(String args[]){
    int arr[]={4,5,0,1,9,0,5,0};
    int idx=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
          int t=arr[idx];
          arr[idx]=arr[i];
          arr[i]=t;
          idx--;
        }
        
    }
    for(int i:arr){
        System.out.println(i);
    }
   }
}
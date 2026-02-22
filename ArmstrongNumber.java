import java.util.Scanner;
public class ArmstrongNumber {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int temp=n;
        int count=0;
        while(temp>0){
          count++;
          temp/=10;
        }
        temp=n;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,count);
            n=n/10;
        } 
        if(original==sum){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
        }
}

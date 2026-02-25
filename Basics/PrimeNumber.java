import java.util.Scanner;

public class PrimeNumber {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();

        //PrimeNumber => number which only divide by itself and one.
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
        }
}

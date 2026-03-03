

import java.util.Scanner;

public class LaunchEH2 {

	public static void main(String[] args) {
		 System.out.println("Connection Established");
		 try {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter numerator for divison :");
		 int n=sc.nextInt();
		 
		 System.out.print("Enter denominator for divison :");
		 int d=sc.nextInt();
		 
		 int result=n/d;
		 System.out.println(result);
		 
		 System.out.println("Please enter size of an array");
		 int size=sc.nextInt();
		 
		 int arr[]=new int[size];
		 
		 System.out.println("Please  enter element for an array ");
		 int ele=sc.nextInt();
		 
		 System.out.println("Please enter position for array element ");
		 int position=sc.nextInt();
		 arr[position]=ele;
		 System.out.println("Elemnt inserted :"+arr[position]);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("please enter non zero number");
		 }
		 catch(NegativeArraySizeException  e) {
			 System.out.println("please enter non negative number");
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("please enter element within a limit");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 System.out.println("Connection Terminated");


	}

}


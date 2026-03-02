
import java.util.Scanner;

public class LaunchExceptionHandling1 {
	
	public static void main(String[] args) 
	{
	 System.out.println("Connection Established");
	 try {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.print("Enter numerator for divison :");
	 int n=sc.nextInt();
	 
	 System.out.print("Enter denominator for divison :");
	 int d=sc.nextInt();
	 
	 int result=n/d;
	 System.out.println(result);
	 }catch(Exception e) {
		 System.out.println("Arithematic Exception Occured");
	 }
	 
	 System.out.println("Connection Terminated");
	}

}

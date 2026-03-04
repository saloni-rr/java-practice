

import java.util.Scanner;
class Alpha{
	void show(){
		try {
	 System.out.println("Alpha connection established");
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.print("Enter numerator for divison :");
	 int n=sc.nextInt();
	 
	 System.out.print("Enter denominator for divison :");
	 int d=sc.nextInt();
	 
	 int result=n/d;
	 System.out.println(result);
	
	 System.out.println("please enter non zero number");
	 System.out.println("Alpha connection established");
		}catch(ArithmeticException e) {
			System.out.println("Please enter non zero number");
		}
	}	 
}
class Beta {

	void disp() {
		System.out.println("Beta connection established");

	Alpha a=new Alpha();
	a.show();
	System.out.println("Beta connection established");

	}
	

}
public class LaunchEH3 {

	public static void main(String[] args) {
	System.out.println("Main connection established");
    Beta b=new Beta();
    b.disp();
	System.out.println("Main connection Terminated");

	}

}

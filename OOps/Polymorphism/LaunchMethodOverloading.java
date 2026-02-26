package OOps.Polymorphism;
class Alpha{
	void add(int a,double b) {
	  double res=a+b;
	  System.out.println("Result of(int,double) :"+res);
	}
	void add(int a, int b) {
		  int res=a+b;	
		  System.out.println("Result of (int,int) :"+res);
	}
	void add(double a,double b) {
		  double res=a+b;	
		  System.out.println("Result of (double,double) :"+res);
	}
}
public class LaunchMethodOverloading{
	public static void main(String[] args) {
    Alpha a=new Alpha();
    a.add(2.4, 1.6);
    a.add(2, 6);
    a.add(2.6, 6);//Type promotion will occur explicitly
	}
}
//Polymorphism==>One thing many forms
//method overloading(CompileTime Polymorphism)
//method name same different (parameters, order of parameters and type of parameters)
//e.g.= add() 
//Remember
// Not allowed
//int add(int a, int b) { return a + b; }
//double add(int a, int b) { return a + b; }
//By changing only return type doesn't method overloading parameters should me different.


class A{
	int a=10;
	int b=20;
	void show() {
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
	}	
}
class B extends A{
	void add() {
		System.out.println("Result is :"+(a+b));
	}
}
public class LaunchInheritance1 {

	public static void main(String[] args) {
    B b=new B();
    b.show();
    b.add();
	}
}
//Inheritance 
//This is the process of acquiring properties from one class to another 
//class is called inheritance.
//there are 5 types of inheritance
//Single level
//above example was single level inheritance.
//Multilevel
//Hybrid level
//Hierarchical 
//Multiple(Not supported)
//Java does not support multiple inheritance with classes to avoid ambiguity prblem.
//however multiple inheritance achieved by Interface.



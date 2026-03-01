//Example of Multilevel Inheritance
class A1{
	int a=10;
	int b=20;
}
class B1 extends A1{
	void show() {
		System.out.println("b is :"+b);
		System.out.println("a is :"+a);
	}

}
class C extends B1{
	void add() {
		System.out.println("Result is"+(a+b));
	}
}

public class LaunchMultilevel {

	public static void main(String[] args) {
		C c=new C();
		c.add();

	}

}

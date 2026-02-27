
class Animal{
	public void eat() {
		System.out.println("Animal eat food");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger sleeps");
	}
	public void sleep() {
		System.out.println("Tiger sleeps");
	}
}
public class LaunchMethodOverriding {

	public static void main(String[] args) {
	Tiger t=new Tiger();
	t.eat();
	}
}
//Method overriding 



interface Vehicle{
	void start();//public final abstract
	void stop();
	int accelarate=12;//public final static 
}
class Bike implements Vehicle{
	public void start() {
		System.out.println("I am starting Bike");	}
	public void stop() {
		System.out.println("I am stoping Bike");
	}
}
class Car implements Vehicle{
	public void start() {
		System.out.println("I am starting Car");	}
	public void stop() {
		System.out.println("I am stoping Car");
		}
}
public class LaunchInterface {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.start();
		b.stop();
	    //Vehicle.accelarate=30;

	}

}
//Interface is a blueprint of class.
//by default interface methods are public final abstract. that is why when we implements abstract
//methods we have to make methods public.
//one interface can be implemented by many Classes.
//Variables declared inside interface are by default public final static we can't reassigned them

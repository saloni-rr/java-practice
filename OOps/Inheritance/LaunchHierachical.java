
class Father{
	String surname ="Rathore";
	public void name() {
		System.out.println("Father Name is : Anil "+surname);
	}

}
class Son extends Father{
	public void name() {
		System.out.println("Son name is : Pritesh "+surname);
	}
}
class Daughter extends Father{
	public void name() {
		System.out.println("Daughter surname is : Saloni "+surname);
	}
}

public class LaunchHierachical {

	public static void main(String[] args) {
	Father s=new Son();
	s.name();

	Father d=new Daughter();
	d.name();

	}

}

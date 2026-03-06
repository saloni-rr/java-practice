import java.util.*;
class Student{
	int age;
	String name;
	double avg;
	
	public Student(int age,String name,double avg){
		this.age=age;
		this.name=name;
		this.avg=avg;
	}
	@Override
	public String toString() {
		return "[ age ="+age+", name ="+name+", avg ="+avg+"]";
	}
}
class Alpha implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		if(o1.age>o2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class LaunchComparator {

	public static void main(String[] args) {
    Student s1=new Student(15,"Amit",89.7);
    Student s2=new Student(14,"Rohit",45.7);
    Student s3=new Student(16,"Saloni",93.7);
    ArrayList<Student> list =new ArrayList<>();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    System.out.println(list);
    Alpha a=new Alpha();
    Collections.sort(list,a);
    System.out.println(list);
	}
}
//There are three ways to implement interface 
//1) Using implements 
//)Using anonymous inner class
//3)Using lambda 
//Above example was using implements 

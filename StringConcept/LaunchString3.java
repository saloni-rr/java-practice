

public class LaunchString3 {

	public static void main(String[] args) {
	//Immutable string
		
	//StringBuffer s=new StringBuffer();
	StringBuilder sb=new StringBuilder();//Both behavior is same
	sb.append("Vikas");
	sb.append(12);
	sb.append(true);
	System.out.println(sb);
	  System.out.println("********************************************");
	
	//capacity (old capacity*2+2)
  StringBuilder s1=new StringBuilder();
  System.out.println(s1.capacity());//16 initially(when nothing is there in constructor)
  s1.append("Tendulkar India");
  System.out.println(s1.capacity());
  StringBuilder s2=new StringBuilder("Sachin");
  System.out.println(s2.capacity());//22
  System.out.println("********************************************");

  String str1="Harish";
  String str2="Harish";//Here checks for content
  System.out.println(str1.equals(str2));//true
  
  StringBuilder sb1=new StringBuilder("Harish");
  StringBuilder sb2=new StringBuilder("Harish");//Here checks for reference
  System.out.println(sb1.equals(sb2));//false
  System.out.println("********************************************");
//  The equals() method is overridden in the String class, but in StringBuilder 
//  and StringBuffer, it is inherited from the Object class.
	}

}


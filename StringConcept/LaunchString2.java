

public class LaunchString2 {

	public static void main(String[] args) {
//	String s="Kavya";
//	s=s+"Maheshwari";
//	System.out.println(s);
	
	//final with String
//	final String str="Kavya";
//	str=str+"Maheshwari";
	//we can't do that bcoz of final not immutability is reason 
	
	//compareTo()method
	String s1="Sachin";
	String s2="Sachin";
	int ans=s1.compareTo(s2);
	String s3="Yadav";
	int res=s1.compareTo(s3);
	System.out.println(ans);//0 if both are equal
	System.out.println(res);//ascii values ke through compare karta hai
	if(ans==0) {
	   System.out.println("Strings are equal");
	}

	//split method
//    String s="Raja Ram Mohan Roy";
//    String arr[]=s.split("a");
//    for(String s1: arr) {
//    System.out.print(s1+" ");
//    }
		
	}

}


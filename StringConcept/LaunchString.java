

public class LaunchString {

	public static void main(String[] args) {
//	String str1="Rahul"	;
//	String str2=new String("Rahul");
//	System.out.println(str1==str2);//false
//	System.out.println(str1.equals(str2));//true
     
//	String str1="Saloni";
//	String str2="Saloni";
//	System.out.println(str1==str2);//true
//	System.out.println(str1.equals(str2));//true
    
	//Case senstivity
//	String str1="Java";
//	String str2="JAva";
//	System.out.println(str1==str2);//false
//	System.out.println(str1.equals(str2));//false
//   System.out.println(str1.equalsIgnoreCase(str2));//true
	
	//mutability
//	String str1="Saloni";
//	System.out.println(str1);//Saloni
//	str1.concat("Rathore");//(Strings are Immutable )
//	System.out.println(str1);//Saloni
//	str1=str1.concat(" Rathore");
//	System.out.println(str1);//Saloni Rathore

	String str1="Saloni";
	String str2=" Rathore";
	String str3= str1+str2;//(References of strings are [+] stored in Heap )
	System.out.println(str3);//Saloni Rathore
	String str4="Saloni"+" Rathore";//(memory ==> String constant pool not heap bcoz 
                                    	//directly strings are used not reference)
	System.out.println(str4);//Saloni Rathore
	System.out.println(str3==str4);//false
	
    System.out.println("****************************************");
	String s="Saloni";
	String s1=s.concat("Rathore");//(memory ==> Heap bcoz built-in method )
	String s2=s+s1;
	System.out.println(s2==s1);//false
	}

}
//Strings are two type- Mutable and Immutable
//mutable means changeable and immutable means non changeable.

//creation of strings-
//String str="Rahul";(Inside heap String constant Pool)(do not allow duplicates)
//String s=new String("Rahul")(Heap Area)(allow duplicates)

//== checks for reference
//equals()method checks for content


import java.util.Scanner;
public class NonRepeatingCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string :");
        String str=sc.nextLine();
        char c=0;
        boolean isExist=false;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
               if(str.charAt(i)!=str.charAt(j)){
                c=str.charAt(i);
                isExist=true;
                break;
               }
            }
        }
        if(isExist){
            System.out.println("Here is:"+c);
        }

        }
    }


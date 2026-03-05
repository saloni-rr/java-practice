import java.util.*;
public class NonRepeatingCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string :");
        String s=sc.nextLine();
        String str=s.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                System.out.println("First NonRepeatingCharacter is = "+ch);
                break;
            }
        }
    }
} 



public class RemoveDuplicate {
    public static void main(String args[]){
        String str="Programming";
        String s1=str.toLowerCase();
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(!s2.contains(Character.toString(s1.charAt(i)))){
               s2+=s1.charAt(i);
            }
        }
        System.out.println("Here is String :"+s2);
    }
}

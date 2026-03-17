public class RemoveSpaces {
    public static void main(String args[]){
        String str="hello world";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
           sb.append(str.charAt(i));
            }
        }
        System.out.println("With Spaces :"+str);
        System.out.println("Removed Spaces :"+sb.toString());
    }
}
//Note we can also use replace method.
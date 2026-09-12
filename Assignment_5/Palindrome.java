//ques 12
package Assignment_5;

public class Palindrome {
    public static boolean Palind(String str){
        StringBuilder sb = new StringBuilder(str);
        String reverStr = sb.reverse().toString();
        if(str.equals(reverStr)){
            System.out.println("The string is a palindrome.");
            return true;
        } else {
            System.out.println("The string is not a palindrome.");
            return false;
        }
    }
    public static void main(String[] args){
            String str = "hello";
            Boolean palin = Palind(str);
            System.out.println("Is the string a palindrome? " + palin);
            
    }
    
}

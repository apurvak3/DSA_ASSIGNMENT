//Write a program to convert the first character of every word in a sentence touppercase.
package Assignment_5;

public class UpperCase {
    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    
}

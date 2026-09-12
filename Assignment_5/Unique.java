//ques 13 unique characters
package Assignment_5;
import java.util.Scanner;
public class Unique {
    public static int countUniqueCharacters(String str){
        int count = 0;
        int[] freq = new int[256];
        for(int i =0 ; i< str.length() ; i++){
            freq[str.charAt(i)]++;
        }
        for(int i =0 ; i< freq.length ; i++){
            if(freq[i] == 1){
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = s.nextLine();
        int uniqueCount = countUniqueCharacters(str);
        System.out.println("Number of unique characters in the string: " + uniqueCount);

    }
}

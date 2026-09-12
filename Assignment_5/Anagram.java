//ques 16
package Assignment_5;

import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] freq = new int[256];
        for(int i =0 ; i< str1.length(); i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = s.nextLine();

        System.out.print("Enter the second string:");
        String str2 = s.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }



    }
}

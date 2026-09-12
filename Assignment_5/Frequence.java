package Assignment_5;

public class Frequence {
     public static int frequency2(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    public static void main(String[] str){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string")
        String str = s.nextLine();
        System.out.println("Enter the character")
        char ch = s.next().charAt(0);
         int count = frequency2(ch , str);
         System.out.print(count);

    } 
    
}

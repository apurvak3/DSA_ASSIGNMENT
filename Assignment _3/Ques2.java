//Read a person's age. Print "Eligible to vote and drive" only if the age is 18 or
//above AND a boolean variable hasLicense is true; otherwise print "Not eligible".
//Use a single compound condition with &&
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        if(age >= 18) {
            System.out.println("Eligible to vote and drive");
        } else {
            System.out.println("Not eligible");
        }
    }
}

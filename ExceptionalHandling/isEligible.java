public class isEligible {

    void checkEligibility(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            throw new InvalidAgeException("Not Eligible to vote");
        }
    }
public static void main(String[] args) {
   isEligible t = new isEligible();
   try{
    t.checkEligibility(13);

   }catch(InvalidAgeException e){
    System.out.println("Exception occure");

   }
   System.out.println("Helllo");
    
}
}
//try catch is method where you can control abnormal interruption to normal flow of execution. It is used to handle exceptions. The try block contains the code that may throw an exception, and the catch block contains the code that handles the exception. If an exception occurs in the try block, the catch block is executed, allowing the program to continue running instead of crashing.
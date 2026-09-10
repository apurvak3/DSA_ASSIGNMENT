import java.util.Scanner;

class Ques1{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
     
      int sum =0 ;
      for(int i  = 0 ; i< 4 ; i++){
          int num = s.nextInt();
          sum += num;
      }
      System.out.println("The sum of the 5 numbers is: " + sum);

    }
}
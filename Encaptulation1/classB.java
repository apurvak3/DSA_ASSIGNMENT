package Encaptulation1;

public class classB {
public static void main(String[] args){
    classA obj = new classA();
    obj.setrollNumber(101);
    System.out.println("Roll Number: " + obj.getrollNumber());
    obj.setrollNumber("John Doe");
}
}

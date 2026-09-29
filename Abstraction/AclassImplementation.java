package Abstraction;
//to run this inheritance is needed..without inheritance abstract class cannot be implemented
//abstract class cant be private static final
//multiple inheritance is not possible in java but we can implement multiple abstract classes using interfaces
public class AclassImplementation extends classA {
    public void main3(){
        System.out.println("This is an abstract method");
    }
    public static void main(String[] args) {
        AclassImplementation ac = new AclassImplementation();
        ac.main();
        ac.main3();
        main2();

    }

}



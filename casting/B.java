package casting;

public class B extends A{
    String s = " bye";
    public static void main(String[] args) {

        B b1 = new B();
        A a1 = new A();
        System.out.println(b1.x + b1.s);;
        System.out.println(a1.x );
    }
}

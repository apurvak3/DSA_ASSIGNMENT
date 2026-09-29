package CollectionExample;
import java.util.HashSet;
public class SetExample {
    int rollno;
    String name ; 
    int marks;

    public SetExample(int rollno , String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
public static void main(String[] args) {
   SetExample s1 = new SetExample(101, "John", 85);
   SetExample s2 = new SetExample(102, "Alice", 90);
   SetExample s3 = new SetExample(103, "Bob", 80);
   HashSet<SetExample> set = new HashSet<SetExample>();
   set.add(s1);
   set.add(s2);
    set.add(s3);
    System.out.println(set);


}
}

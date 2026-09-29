package GenericsExample;
import java.util.Vector;
public class VectorExample {
public static void main(String[] args) {
    Vector<String> v = new Vector<>();
    v.add("mobile");
    v.add("mouse");
    v.add("keyboard");
    v.remove(1);
    System.out.println("Elements are: " + v);

}
}

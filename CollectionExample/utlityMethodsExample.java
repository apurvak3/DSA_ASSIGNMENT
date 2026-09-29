
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class utlityMethodsExample {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
    List n = new ArrayList();
    n.add(100);
    n.add(20);
    n.add(30);
    n.add(50);
    Collections.sort(n);
    Collections.reverse(n);
    System.out.println(n);
}
}

package comparision;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
public static void main(String[] args) {
    Employee e1 = new Employee(101, "Ravi");
    Employee e2 = new Employee(103,"Apurva");
    ArrayList<Employee> list = new ArrayList<Employee>();
    list.add(e1);
    list.add(e2);
    Collections.sort(list);
    System.out.println(list);


}
}

package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
          ArrayList a1 = new ArrayList();
a1.add(100);
a1.add(500);
a1.add(300);
System.out.println(a1); 
ArrayList a2 = new ArrayList();
a2.add(800);
a2.add(500);
a2.add(600);
a2.addAll(a1);
System.out.println(a2);

//get : used to read on the basis of their indexvalue
System.out.println(a2.get(3));
//set: it is used to update the value  of certain index
System.out.println(a2.set(3 , "hii"));

String[] s1 = {"apurva" , "sanjana" , "Ankita"};

    }

}

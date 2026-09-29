package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
      public static void main(String[] args) {
        Vector v = new Vector();
        v.add(5);
        v.add(6);
        v.add(10);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
           Integer i1 = (Integer)e.nextElement();
            System.out.println(i1);

        }
      }
}

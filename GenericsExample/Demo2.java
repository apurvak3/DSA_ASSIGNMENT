package GenericsExample;

import java.util.ArrayList;

public class Demo2 {
public static void main(String[] args) {
    ArrayList<String> shoppingCart = new ArrayList<>();
    shoppingCart.add("Apple");
    shoppingCart.add("Banana");
    shoppingCart.add("Orange");
    System.out.println(shoppingCart);
    
    shoppingCart.remove("Banana");
    System.out.println(shoppingCart);
}
}

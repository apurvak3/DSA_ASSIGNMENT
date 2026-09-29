package GenericsExample;

import java.util.ArrayList;

public class Demo1 {
public static void main(String[] args) {
    
    ArrayList<Integer> integerBox = new ArrayList<>();
    integerBox.set(10);
    System.out.println("Integer Value: " + integerBox.get());

    Box<String> stringBox = new Box<>();
    stringBox.set("Hello Generics");
    System.out.println("String Value: " + stringBox.get());
}
}

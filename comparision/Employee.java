package comparision;

import javax.swing.border.StrokeBorder;

public class Employee implements Comparable<Employee>{
    int id ;
    String name;

    Employee(int id , String name){
        this.id  = id;
        this.name = name;

    }
    public int compareTo(Employee e){
        return this.id - e.id;
    }
    public String toString(){
        return id + " " + name;
    }

}

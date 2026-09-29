package GenericsExample;
//using set interface store 3 student object which consist of student roll no , student name , student marks

import java.util.HashSet;
import java.util.Set;

public class Student{
     int rollNo;
     String name;
     int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "John", 85));
        studentSet.add(new Student(2, "Jane", 90));
        studentSet.add(new Student(3, "Bob", 80));

        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

}

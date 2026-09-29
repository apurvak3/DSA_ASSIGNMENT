package GenericsExample;
//create an employ list with salARY AND find the employee whose salary is highest
public class Demo3 {
public static void main(String[] args) {
    ArrayList<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("John", 50000));
    employeeList.add(new Employee("Jane", 60000));
    employeeList.add(new Employee("Bob", 55000));
    collection.max(employeeList, Comparator.comparing(Employee::getSalary));
}
}

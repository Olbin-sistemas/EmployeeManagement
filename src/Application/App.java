package Application;

import Employee.Employee;

public class App {

    public static void main(String[] args) {
        Employee e1 = new Employee("12345", "JOAN", "SEBASTIAN", 57, "joansebastian@gmail.com");

        System.out.println(e1.getEmail());
    }
}

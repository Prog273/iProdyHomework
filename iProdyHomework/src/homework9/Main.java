package homework9;

import static homework9.Employee.printInfo;
//здесь не понял, почему IDEA ругалась и потребовала импортировать метод. Я ведь его public создал

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", "Korolev", "manager", "ak@ya.ru", 1234, 50000, 31);
        Employee employee2 = new Employee("Sam", "Wilson", "security", "sw@ya.ru", 837464, 70000, 43);
        Employee employee3 = new Employee("Olga", "Somova", "junior developer", "os@ya.ru", 459375, 100000, 28);
        Employee employee4 = new Employee("Igor", "Kotov", "senior developer", "ik@ya.ru", 395857, 400000, 45);
        Employee employee5 = new Employee("Daria", "Petrova", "cleaner", "dp@ya.ru", 32443, 20000, 55);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (var employee : employees) {
            if (employee.getAge() > 40) {
                printInfo(employee);
                System.out.println("__________________");
            }
        }
    }
}

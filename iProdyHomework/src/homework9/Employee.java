package homework9;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String firstName, String lastName, String position, String email, int phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static void printInfo(Employee employee) {
        System.out.println("Имя: " + employee.getFirstName());
        System.out.println("Фамилия: " + employee.getLastName());
        System.out.println("Должность: " + employee.getPosition());
        System.out.println("Электронная почта: " + employee.getEmail());
        System.out.println("Номер телефона: " + employee.getPhoneNumber());
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println("Возраст: " + employee.getAge());
    }
}

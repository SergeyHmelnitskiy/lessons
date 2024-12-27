package lesson4;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО: " + name + "; должность: " + position + "; email: " + email +
                "; телефон: " + numberPhone + "; зарплата: " + salary + "; возраст: " + age + "\n");
    }

    public String toString() {
        return "ФИО: " + name + "; должность: " + position + "; email: " + email +
                "; телефон: " + numberPhone + "; зарплата: " + salary + "; возраст: " + age + "\n";
    }
}

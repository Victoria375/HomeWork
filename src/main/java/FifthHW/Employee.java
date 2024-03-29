package FifthHW;

public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("ФИО: %s\nДолжность: %s\nПочта: %s\nТелефон: %s\nЗарплата: %s\n" +
                "Возраст: %s\n", fullName, position, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }

}

package FifthHW;

public class FifthHW {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "5563215", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Accountant", "petr@mailbox.com", "1234567", 40000, 50);
        employeeArray[2] = new Employee("Petrova Sveta", "Driver", "sveta@mailbox.com", "7654321", 50000, 45);
        employeeArray[3] = new Employee("Ivanova Dasha", "Director", "dasha@mailbox.com", "1122322", 60000, 35);
        employeeArray[4] = new Employee("Smirnov Vlad", "Economist", "vlad@mailbox.com", "4521678", 70000, 25);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].info();
                System.out.println();
            }
        }
    }
}

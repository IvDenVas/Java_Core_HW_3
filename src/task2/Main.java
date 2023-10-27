package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", "Иван", 90_000);
        Employee employee2 = new Employee("Петров", "Петр", 85_000);
        Chief chief = new Chief("Сидоров", "Петр", 130_000);

        Employee[] employees = {employee1,employee2,chief};
        System.out.println(Arrays.toString(employees));
        System.out.println("Поднимаем заработную плату");
        Chief.salaryIncreaseAllEmployees(employees, 13_000);
        System.out.println(Arrays.toString(employees));
    }
}

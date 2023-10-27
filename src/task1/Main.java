package task1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов","Иван",LocalDate.of(2000,12,15));
        Employee employee2 = new Employee("Петров","Петр",LocalDate.of(1999,6,25));
        Employee employee3 = new Employee("Сидоров","Олег",LocalDate.of(1995,1,5));
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println(list);
        System.out.println("Проверка сортировкой");
        Collections.sort(list);
        System.out.println(list);
    }
}
package task1;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private String surname;
    private String name;
    private LocalDate localDate;

    public Employee(String surname, String name, LocalDate localDate) {
        this.surname = surname;
        this.name = name;
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ' + localDate;
    }


    @Override
    public int compareTo(Employee employee) {
        return getLocalDate().compareTo(employee.getLocalDate());
    }
}

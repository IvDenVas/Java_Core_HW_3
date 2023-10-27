package task2;

public class Employee {
    private final String surname;
    private final String name;
    private int salary;

    public Employee(String surname, String name, int salary) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ' + salary;
    }
/*
    public static void salaryIncrease(Employee employee, int sum){
        employee.setSalary(employee.getSalary() + sum);
    }
*/
}

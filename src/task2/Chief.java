package task2;
public class Chief extends Employee{

    public Chief(String surname, String name, int salary) {
        super(surname, name, salary);
    }
    public static void salaryIncrease(Employee employee, int sum){
        employee.setSalary(employee.getSalary() + sum);
    }

    public static void salaryIncreaseAllEmployees(Employee[] employees, int sum) {
        for (Employee i: employees) {
            if (i instanceof Chief) return;
            else salaryIncrease(i,sum);
        }
    }
}

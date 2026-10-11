
class Employee {
    private String name;
    private int id;
    private double monthlySalary;

    Employee(String name, int id, double monthlySalary) {
        if (id <= 0 || monthlySalary < 0) {
            throw new IllegalArgumentException("Invalid employee details.");
        }

        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public double annualSalary() {
        return monthlySalary * 12;
    }

    public void compare(Employee other, int employeeNumber,
                        int otherNumber) {
        if (annualSalary() > other.annualSalary()) {
            System.out.println("Employee " + employeeNumber
                    + " earns more than Employee " + otherNumber + ".");
        } else if (annualSalary() < other.annualSalary()) {
            System.out.println("Employee " + otherNumber
                    + " earns more than Employee " + employeeNumber + ".");
        } else {
            System.out.println("Employee " + employeeNumber
                    + " and Employee " + otherNumber
                    + " have equal annual salaries.");
        }
    }

    public Employee higherPaid(Employee other) {
        if (annualSalary() >= other.annualSalary()) {
            return this;
        }
        return other;
    }

    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary();
    }
}

public class compare_two_employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101, 40000);
        Employee e2 = new Employee("Amit", 102, 50000);
        Employee e3 = new Employee("Priya", 103, 50000);

        e1.compare(e2, 1, 2);
        e2.compare(e3, 2, 3);

        Employee highest = e1.higherPaid(e2);
        highest = highest.higherPaid(e3);

        System.out.println("Highest-paid employee: " + highest.getName());
        System.out.println("Annual Salary: " + highest.getAnnualSalary());
    }
}

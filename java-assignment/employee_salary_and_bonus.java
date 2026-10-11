
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double monthlySalary;
    private int rating;

    Employee(String name, int id, double salary, int rating) {
        if (salary < 0 || rating < 1 || rating > 5 || id <= 0) {
            throw new IllegalArgumentException("Invalid employee details.");
        }

        this.name = name;
        this.id = id;
        this.monthlySalary = salary;
        this.rating = rating;
    }

    public double annualSalary() {
        return monthlySalary * 12;
    }

    public double bonus() {
        double percent = 0;

        if (rating == 5) {
            percent = 20;
        } else if (rating == 4) {
            percent = 15;
        } else if (rating == 3) {
            percent = 10;
        } else if (rating == 2) {
            percent = 5;
        }

        return annualSalary() * percent / 100;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary());
        System.out.println("Annual Bonus: " + bonus());
        System.out.println("Total Annual Compensation: "
                + (annualSalary() + bonus()));
    }
}

public class employee_salary_and_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Performance Rating: ");
        int rating = sc.nextInt();

        try {
            Employee e = new Employee(name, id, salary, rating);
            e.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.Scanner;

public class student_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll Number: ");
        int roll = Integer.parseInt(sc.nextLine());

        System.out.println("Enter marks for five subjects:");

        int m1 = Integer.parseInt(sc.nextLine());
        int m2 = Integer.parseInt(sc.nextLine());
        int m3 = Integer.parseInt(sc.nextLine());
        int m4 = Integer.parseInt(sc.nextLine());
        int m5 = Integer.parseInt(sc.nextLine());

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");

        
    }
}

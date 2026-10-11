import java.util.Scanner;

public class strong_no_verification {

    static int factorial(int n) {
        int fact = 1;
     for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
    static boolean isStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + factorial(digit);
            n = n / 10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        if (n > 0 && isStrong(n)) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }

    }
}

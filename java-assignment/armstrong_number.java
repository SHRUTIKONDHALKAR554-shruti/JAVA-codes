import java.util.Scanner;

public class armstrong_number {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + power(digit, digits);
            n = n / 10;
        }

        return sum == original && digits > 1 || original == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers: ");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
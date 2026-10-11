import java.util.Scanner;

public class prime_factorization {

    static void primeFactors(int n) {
        if (n == 1) {
            System.out.println("1 has no prime factors.");
            return;
        }

        System.out.print("Prime factorization: ");

        for (int i = 2; i <= n; i++) {
            int count = 0;

            while (n % i == 0) {
                count++;
                n = n / i;
            }

            if (count > 0) {
                for (int j = 1; j <= count; j++) {
                    System.out.print(i);

                    if (j < count || n > 1) {
                        System.out.print(" x ");
                    }
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. Enter a number greater than or equal to 1.");
        } else {
            primeFactors(n);
        }


    }
}

import java.util.Scanner;

public class gcd_and_lcm{

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(int a, int b) {
        return (long) (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int a = sc.nextInt();

        System.out.print("Second number: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Enter positive integers only.");
        } else {
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        }

        
    }
}


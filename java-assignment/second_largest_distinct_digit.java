
import java.util.Scanner;

public class second_largest_distinct_digit {
    static int secondLargest(int n) {
        int largest = -1;
        int second = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } 
            else if (digit < largest && digit > second) {
                second = digit;
            }

            n = n / 10;
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();

        int result = secondLargest(n);

        if (result == -1) {
            System.out.println("Fewer than two distinct digits exist.");
        } else {
            System.out.println("Second-largest distinct digit: " + result);
        
    }
}
}

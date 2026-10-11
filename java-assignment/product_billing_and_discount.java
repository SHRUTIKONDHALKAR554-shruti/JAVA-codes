
import java.util.Scanner;

class Product {
    private String name;
    private int id;
    private double price;
    private int quantity;

    Product(String name, int id, double price, int quantity) {
        if (price < 0 || quantity <= 0 || id <= 0) {
            throw new IllegalArgumentException("Invalid product details.");
        }

        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public double subtotal() {
        return price * quantity;
    }

    public double discount() {
        double total = subtotal();

        if (total >= 10000) {
            return total * 0.15;
        } else if (total >= 5000) {
            return total * 0.10;
        } else if (total >= 1000) {
            return total * 0.05;
        }

        return 0;
    }

    public double finalBill() {
        return subtotal() - discount();
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Discount: " + discount());
        System.out.println("Final Bill: " + finalBill());
    }
}

public class product_billing_and_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Product: ");
        String name = sc.nextLine();

        System.out.print("Product ID: ");
        int id = sc.nextInt();

        System.out.print("Unit Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        try {
            Product p = new Product(name, id, price, quantity);
            p.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    
    }
}


class shop{
    String compnent;
    double price;
}
public class laptopshop {

    public static void main(String[] args) {
        shop p1=new shop();

        p1.compnent="laptop";
        p1.price=50000;

        shop p2=p1;
        p2.price=45000;

        System.out.println("p1 price:" + p1.price);
        System.out.println("p2 price:" + p1.price);
    }
}


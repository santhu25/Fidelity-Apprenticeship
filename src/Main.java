import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product();

        System.out.println("Enter details for Product 1:");
        System.out.println("Product ID:");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product Name:");
        String name1 = sc.next();
        System.out.println("Product Category:");
        String category1 = sc.next();

        p1.setProductDetails(id1, name1, category1);
        System.out.println("Product details:");
        System.out.println("Product ID: ");

        System.out.println("---Product 1 details---");
        p1.displayProductDetails();



    }
}
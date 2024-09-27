import java.util.Scanner;

public class BoolResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        int x = sc.nextInt();
        System.out.println("Enter the value for Y: ");
        int y = sc.nextInt();

        boolean result = (x < y) ? true : false;
        System.out.println("The result of whether the X is less than the Y is " + result);
        sc.close();
    }
}

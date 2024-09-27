import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}


public class CustomExcepDemo {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if(age < 18)
            {
                throw new AgeException("You are not eligible");
            }
            else{
                System.out.println("You are eligible");
            }
        }
        catch (AgeException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int product = num1 * num2;
            System.out.println("Product is " + product);
        } catch (Exception e)
        {
            System.out.println("An unexpected error occurred:" + e.getMessage());
        } finally {
            System.out.println("Goodbye!");
        }
    }

}

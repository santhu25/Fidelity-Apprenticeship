import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Country: ");
        String country = sc.nextLine();

        System.out.println("\nWelcome " +name + ".Your Age is " + age + "and you are from " + country + ".");
        sc.close();
    }
}

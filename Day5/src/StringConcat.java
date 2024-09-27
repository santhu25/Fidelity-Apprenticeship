import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();

        String concat = firstName + " " + lastName;

        System.out.println("Full Name: " + concat);
    }
}

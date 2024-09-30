import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> employees = new ArrayList<String>();
        System.out.println("Enter no of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name:");
            String employeename = sc.nextLine();
            employees.add(employeename);
        }
        List<String>filter =employees.stream()
                .filter(name-> name.startsWith("A")||name.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println("Employees whose name starts with A:");
        filter.forEach(System.out::println);
    }
}

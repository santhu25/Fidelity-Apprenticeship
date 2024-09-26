
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter students marks: ");
        int marks = sc.nextInt();

        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("The students grade is : " + grade);
        switch (grade) {
            case 'A':
                System.out.println("excellent");
                break;
                case 'B':
                    System.out.println("Very good");
                    break;
                    case 'C':
                        System.out.println("good");
                        break;
                        case 'D':
                            System.out.println("fair");
                            break;
                            case 'E':
                                System.out.println("pass");
                                break;
                                case 'F':
                                    System.out.println("not pass");
                                    break;
                                    default:
                                        System.out.println("Invalid grade");
                                        break;
        }
        sc.close();

    }
}
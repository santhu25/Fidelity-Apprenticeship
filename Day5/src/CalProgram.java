import java.util.Scanner;
 class Calculator{
    public int Addition(int a, int b) {
        return a + b;
    }

    public int Subtraction(int a,int b) {
        return a - b;
    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b, double[] remainder) {
        if (b==0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        remainder[0] = a % b;
        return (double) a / b;
    }
}



public class CalProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();
        System.out.println("Enter the operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the first operand: ");
        int operand1 = sc.nextInt();
        System.out.println("Enter the second operand: ");
        int operand2 = sc.nextInt();

        double[] remainder = new double[1];
        double result;

        switch (operator) {
            case '+':
                result = calculator.Addition(operand1, operand2);
                System.out.println("Result of " + operand1 + "+" + operand2 + " = " + result);
                break;
                case '-':
                    result = calculator.Subtraction(operand1, operand2);
                    System.out.println("Result of " + operand1 + "-" + operand2 + " = " + result);
                    break;
                    case '*':
                        result = calculator.Multiplication(operand1, operand2);
                        System.out.println("Result of " + operand1 + "*" + operand2 + " = " + result);
                        break;
                        case '/':
                            try {
                                result = calculator.Division(operand1, operand2, remainder);
                                System.out.println("Result of " + operand1 + "/" + operand2 + " = " + result);
                                System.out.println("Remainder = " + remainder[0]);
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                            default:
                                System.out.println("Invalid operator");
                                break;

        }
        sc.close();
    }
}

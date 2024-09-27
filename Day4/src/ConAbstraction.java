import java.util.Scanner;


abstract class Shape {
    public abstract double calculateVolume();
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius,double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
        }
    }

    class Cube extends Shape {
        private double side;

        public double calculateVolume(){
            return side * side * side;
        }
    }



public class ConAbstraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Choose a shape to calculate volume: ");
        System.out.println("1. Cylinder");
        System.out.println("2. Cube");
        int choice = sc.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of cylinder: ");
                double radius = sc.nextDouble();
                System.out.println("Enter the height of cylinder: ");
                double height = sc.nextDouble();
                shape = new Cylinder(radius,height);
                break;
            case 2:
                System.out.println("Enter the side length of cube: ");
                double side = sc.nextDouble();
                shape = new Cube();
                break;
            default:
        }
        if(shape!=null) {
            System.out.println("The volume of the selected shape is: " + shape.calculateVolume());
        }
        sc.close();
    }
}

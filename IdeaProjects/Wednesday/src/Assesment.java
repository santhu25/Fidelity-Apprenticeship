import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    float basicSalary;
    float bonus;
    float netSalary;

    public Employee(int empId, String empName, float basicSalary, float bonus, float netSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0f;
        this.netSalary = 0.0f;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }

}

class PermanentEmployee extends Employee {
    int pf;

    public PermanentEmployee(int empId, String empName, float basicSalary, float bonus, float netSalary, int pf) {
        super(empId, empName, basicSalary, bonus, netSalary);
        this.pf = pf;
        calculatebonus();
        calculatenetSalary();
    }
    public void calculatebonus() {
        if (pf < 1000) {
            bonus = 0.10f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.15f * basicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
                bonus = 0.15f * basicSalary;
    }
}
public void calculatenetSalary() {
        netSalary = basicSalary - pf;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}



public class Assesment {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Eshther", 25000, 1500);
        System.out.println("The details are:");
        permanentEmployee.calculatebonus();
        permanentEmployee.displayDetails();
        System.out.println();

    }



    }


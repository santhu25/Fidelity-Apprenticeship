//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Insurance number");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Amount Covered");
        double covered = sc.nextDouble();
        System.out.println("Enter Insurance option 1. for life Insurance, 2.For motor insurance");
        int option = sc.nextInt();
        Insurance ins = null;

        if (option == 1) {
            LifeInsurance li = new LifeInsurance();
            li.setInsuranceNo();
            li.setInsuranceName(insuranceName);
            li.setAmountCovered(covered);

            System.out.println("Enter policy term:");
            li.setPolicyTerm(sc.nextInt());
            System.out.println("Enter benefit percent:");
            li.setBenefitPercent(sc.nextInt());

            ins = li;
        }
            else if (option == 2) {
            MotorInsurance mi = new MotorInsurance();
            mi.setInsuranceNo();
            mi.setInsuranceName(insuranceName);
            mi.setAmountCovered(covered);

            System.out.println("Enter depreciation percent");
            mi.setDepPercent(sc.nextFloat());
            ins = mi;
        } else {
                System.out.println("Invalid option");
                return;
            }
            double premium = addPolicy(ins,option);
            System.out.println("Calculated premium: " + premium);
        }

        public static double addPolicy(Insurance ins, int opt){
            if(opt == 1){
                return((LifeInsurance) ins).calculatePremium();
            } else if(opt==2){
                return ((MotorInsurance) ins).calculatePremium();
            }
            return 0;
        }

    }

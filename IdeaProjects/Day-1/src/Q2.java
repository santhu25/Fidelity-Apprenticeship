import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int pizzaPrice =200;
        int puffPrize = 40;
        int coolDrinkPrice = 120;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of pizzas bought:");
        int numPizzas = sc.nextInt();
        System.out.println("enter the number of puff bought:");
        int numPuffs = sc.nextInt();
        System.out.println("enter the number of cool drink bought:");
        int numCools = sc.nextInt();

        int  totalPizzaCost = numPizzas * pizzaPrice;
        int  totalPuffCost = numPuffs * puffPrize;
        int  totalCoolCost = numCools * coolDrinkPrice;

        int grandTotal = totalPizzaCost + totalPuffCost + totalCoolCost;
        System.out.println("\nBILL DETAILS");
        System.out.println("Total cost of pizzas: " + totalPizzaCost);
        System.out.println("Total cost of puffs: " + totalPuffCost);
        System.out.println("Total cost of cool drinks: " + totalCoolCost);
        System.out.println("Grand Total cost: " + grandTotal);
        sc.close();
    }
}

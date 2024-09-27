import java.util.Scanner;

class Bank {
    private String accHolName;
    private String accNum;
    private int balance;

    public Bank(String accHolName,String accNum,int balance) {
        this.accHolName=accHolName;
        this.accNum=accNum;
        this.balance=balance;
    }

    public void performTransaction(int amount){
        balance += amount;
        System.out.println("Deposit of " + amount + "made successfully.");
        System.out.println("New Balance: " + balance);

    }
    public void performTransaction(int amount, boolean isWithdrawal) {
        if (isWithdrawal){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawal of " + amount + "made successfully!");
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
    }
    public void performTransaction(String fromAccount, String toAccount, int amount){
        if (fromAccount.equals(accNum) && amount <= balance) {
            balance -= balance;
            System.out.println("Transfer of " + amount + " from account: " + toAccount + " completed.");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Transfer failed. Check the account details ");
        }
    }
    public void performTransaction(){
        System.out.println("Account Holder Name " + accHolName);
        System.out.println("Account Number " + accNum);
        System.out.println("Current Balance " + balance);
    }
}

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank account = new Bank("Santhosh","123456678",10000);

        System.out.println("-------Welcome to Bank application!-------");
        System.out.println("1.DEPOSIT");
        System.out.println("2.WITHDRAW");
        System.out.println("3.TRANSFER");
        System.out.println("4.PRINT ACCOUNT DETAILS");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter the amount to deposit: ");
                int depositAmount = sc.nextInt();
                account.performTransaction(depositAmount);
                break;

            case 2:
                System.out.println("Enter the withdrawal amount: ");
                int withdrawAmount = sc.nextInt();
                account.performTransaction(withdrawAmount);
                break;

            case 3:
                System.out.println("Enter the from account number");
                String fromAccount = sc.next();
                System.out.println("Enter the to account number");
                String toAccount = sc.next();
                System.out.println("Enter the amount to transfer");
                int transferAmount = sc.nextInt();
                account.performTransaction(transferAmount);
                break;

            case 4:
                account.performTransaction();
                break;

            default:
                System.out.println("Invalid Choice! please try again");
                break;
        }
        sc.close();
    }
}

import java.util.Scanner;

 class Account{
    private int id;
    private String accountType;
    private double balance;

    public Account() {
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean Withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public String GetDetails() {
        return "Account ID: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}


public class AccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account ID: ");
        int id1 = sc.nextInt();
        System.out.println("Enter Account Type: ");
        sc.nextLine();
        String accountType = sc.nextLine();
        System.out.println("Enter Balance: ");
        double balance1 = sc.nextDouble();

        Account account1 =new Account(id1, accountType, balance1);
        System.out.println("Enter amount to withdraw: ");
        double withdrawalAmount1 = sc.nextDouble();

        if (account1.Withdraw(withdrawalAmount1)) {
            System.out.println("Withdraw Successful!! New Balance: " + account1.getBalance());
        } else {
            System.out.println("Withdrawal failed!! Due to insufficient funds!");
        }
        System.out.println();

        System.out.println("Enter Account ID: ");
        int id2 = sc.nextInt();
        System.out.println("Enter Account Type: ");
        sc.nextLine();
        String accountType2 = sc.nextLine();
        System.out.println("Enter Balance: ");
        double balance2 = sc.nextDouble();
        Account account2 =new Account(id2, accountType2, balance2);
        System.out.println("Enter amount to deposit: ");
        double withdrawAmount2 = sc.nextDouble();
        if (account2.Withdraw(withdrawAmount2)) {
            System.out.println("New Balance: " + account2.getBalance());

        } else {
            System.out.println("Insufficient funds!");
        }
        sc.close();

    }
}

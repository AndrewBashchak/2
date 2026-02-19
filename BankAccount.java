public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        setOwnerName(ownerName);
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && ownerName.length() >= 3) {
            this.ownerName = ownerName;
        } else {
            System.out.println("The name must be at least 3 characters long");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The top-up amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("There are not enough funds in the account");
            }
        } else {
            System.out.println("The withdrawal amount must be positive");
        }
    }

    public void getInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Owner name: " + ownerName);

        String correctBalance = String.format("%.2f", balance);
        System.out.println("Balance: " + correctBalance);
    }
}



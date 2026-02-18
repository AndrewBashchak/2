public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("UA12345", "Andrew", 542.4);
        acc1.getInfo();

        acc1.deposit(100);
        acc1.withdraw(600.55);
        acc1.setOwnerName("Di");
        acc1.getInfo();
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("001", 5000);
        BankAccount acc2 = new BankAccount("002", 1500);

        Customer customer1 = new Customer("Tom", 18, acc1);
        Customer customer2 = new Customer("Chris", 19, acc2);

        Bank bank = new Bank("MyBank");

        System.out.println("Customer name: " + customer1.getName());
        System.out.println("Balance: " + customer1.getAccount().getBalance());

        System.out.println("Customer name: " + customer2.getName());
        System.out.println("Balance: " + customer2.getAccount().getBalance());

        if (acc1.getBalance() > acc2.getBalance()) {
            System.out.println("First account has more money");
        } else {
            System.out.println("Second account has more money");
        }
    }
}

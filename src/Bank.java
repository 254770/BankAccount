public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void compareAccounts(BankAccount a1, BankAccount a2) {
        if (a1.getBalance() > a2.getBalance()) {
            System.out.println("First account has more money");
        } else if (a1.getBalance() < a2.getBalance()) {
            System.out.println("Second account has more money");
        } else {
            System.out.println("Both accounts have equal balance");
        }
    }
}

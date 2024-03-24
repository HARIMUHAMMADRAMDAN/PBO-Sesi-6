package emoney;
public class Dana implements DigitalMoney, Bank {
    private String nomorAccount;

    public Dana(String nomerAccount) {
        this.nomorAccount = nomerAccount;
    }

    public void topup(int amount) {
        System.out.println("Top up: " + amount);
    }

    public String getNomerAccount() {
        return nomerAccount;
    }
    public void pay(int amount) {
        System.out.println("pay: " + amount);
    }

    public void chechBalance() {
        System.out.println("Check balance");
    }

    public void withdraw(int amount) {
        System.out.println("Withdraw: " + amount);
    }

    public void transfer(int amount, String accountNumber) {
        System.out.println("Transfer: " + amount + " to " + accountNumber);
    }
}

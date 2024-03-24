package emoney;

public interface Bank {
    String getNomorAccount();
    void transfer(int amount, String accountNumber);
}

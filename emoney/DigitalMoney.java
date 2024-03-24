package emoney;

public interface DigitalMoney {
    void topup(int amount);
    void pay(int amount);
    void chechBalance();
    void withdraw(int amount);
    void transfer(int amount, String accountNumber);
}

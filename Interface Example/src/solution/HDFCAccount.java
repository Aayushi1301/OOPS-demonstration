package solution;

public class HDFCAccount implements  IAccount{
    private double deposits;
    private double withdrawals;


    public double getBalance()
    {
        return deposits - withdrawals;
    }

    public void deposit(double amount)
    {
        deposits += amount;
    }

    public void withdraw(double amount)
    {
        withdrawals += amount;
    }
}

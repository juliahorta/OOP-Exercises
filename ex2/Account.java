
/**
 * @julia
 * @15/01/19
 */
class Account
{   
    private double balance;
    private double interestRate;
    
    public Account(double initialBalance)
    {
        balance = initialBalance;
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setInterest(double rate)
    {
        interestRate = rate;
    }
    
    public double getInterest()
    {
        return interestRate;
    }
    public void computeInterest(int n)
    {
        balance = balance * (Math.pow((1 + interestRate),(n / 12)));
    }
}

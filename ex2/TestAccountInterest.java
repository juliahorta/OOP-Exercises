
/**
 * @julia
 * @15/01/19
 */
class TestAccountInterest
{
    public static void main(String[]arg)
    {
        Account account1 = new Account(500);   // declaring new accounts
        Account account2 = new Account(100);
        account1.setInterest(0.1);  // setting interest rate to 10%
        account2.setInterest(0.1);
        System.out.println(account1.getInterest());
        account1.computeInterest(12); 
        System.out.println("Account1's balance after 12 months: " + account1.getBalance());
        account1.computeInterest(12);
        System.out.println("Account1's balance after 24 months: " + account1.getBalance());
        account2.computeInterest(12);
        System.out.println("Account2's balance after 12 months: " + account2.getBalance());
        account2.computeInterest(12);
        System.out.println("Account2's balance after 24 months: " + account2.getBalance());
        
    }
}

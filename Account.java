
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private int feeCharge;
    
    
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        feeCharge = 10;
        
    }
    
    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String toString()
    {
        return "name: "+name + " acctNum: " + acctNum + " balance: " + getBalance();
    }
    
    public double chargeFee()
    {
        balance -= feeCharge;
        return balance;
    }
    
    public void changeName(String newName)
    {
        name = newName;
    }
}

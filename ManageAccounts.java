
/**
 * Write a description of class ManageAccounts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//A test of me using comments

public class ManageAccounts{
    
   public ManageAccounts()
   {
       
   }
 
   
   public static void main(String[] args)
   {
       Account acc1, acc2;
       
       acc1 = new Account(1000,"Sally",1111);
       acc2 = new Account(500,"Joe",1000);
       System.out.println(acc1);
       System.out.println(acc2);
       
       acc2.deposit(100);
       System.out.println("Joe's Balance: " + acc2.getBalance());
       acc1.withdraw(50);
       System.out.println("Sally's Balance: " + acc1.getBalance());
       
       System.out.println("Joe's Balance: " + acc1.chargeFee());
       System.out.println("Sally's Balance: " + acc2.chargeFee());
       
       acc2.changeName("Joseph");
       
       System.out.println(acc1);
       System.out.println(acc2);
   }
   
     
   public String toString()
   {
       return "";
   }
   
}
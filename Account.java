import java.util.*;
class Account 
{
    protected double amount; 
    protected int balance = 0; 
    protected int withdrawAmount; 
    Account() 
    {
        balance = 0;
        System.out.println("The balance in your account is: $" + balance);
    }
    void add() 
    {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("The balance in your account is: $" + balance);
    }
    void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Insufficient funds. $5 penalty charged.");
            balance -= 5;
        } 
        else 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }
    void computeInterest(double interestRate) 
    {
        double interest = (interestRate / 100) * balance;
        balance += interest;
        System.out.println("Interest computed: $" + interest);
    }
    int getBalance() 
    {
        return balance;
    } 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.print("Enter the amount to deposit: $");
        account.amount = scanner.nextDouble();
        account.add();
        System.out.print("Enter the amount to withdraw: $");
        account.withdrawAmount = scanner.nextInt();
        account.withdraw(account.withdrawAmount); 
        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();
        account.computeInterest(interestRate);
        int finalBalance = account.getBalance();
        System.out.println("Final balance: $" + finalBalance);
        scanner.close();
    }
}
import java.math.BigDecimal;
import java.math.MathContext;

public class Account {
    private String name; // instance variable
    private double balance; // instance variable
    BigDecimal b = new BigDecimal(balance, MathContext.DECIMAL64);

    // Account constructor that receives two parameters
    public Account(String name, double balance){
        this.name = name; // assign name to instance variable name
        if (balance > 0.0) {
            this.balance = balance; // assign it to instance variable balance
        }
    }
    // Deposit
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount; // add it to the balance
        }
    }
    // Withdrawal
    public void withdraw(double withdrawAmount){
        if (balance - withdrawAmount > 0){
            balance = balance - withdrawAmount;
        }
        else{
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void displayAmount(){
        System.out.printf("%s balance: $%.2f%n", this.name, this.b);
    }
}
import java.util.Random;
import java.util.random.*;

public class Account{
    private int balance;
    private int uniqueId;
    private double interest;

    public Account(){
        this.uniqueId = returnUniqueId();
        this.balance = 0;
        this.interest = 0.01;
    }
    public Account(int balance){
        this.uniqueId = returnUniqueId();
        this.balance= balance;
        this.interest = 0.01;
    }

    public Account(int uniqueId, int balance){
        this.uniqueId = uniqueId;
        this.balance = balance;
        this.interest = 0.01;
    }

    public Account(int initialBalance, double interest){
        this.uniqueId = returnUniqueId();
        this.balance = initialBalance;
        this.interest = interest;
    }
    public int returnUniqueId(){
        Random random = new Random();
        return random.nextInt();
    }

    public double getInterest() {
        return this.interest;
    }

    public int getUniqueId(){ return this.uniqueId; }

    public int getBalance(){ return this.balance; }

    public void setBalance(int amount){ this.balance = amount; }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        if (amount > this.balance){
            System.out.println("Error. The amount to be withdrawn exceeds this account's balance.");
        }
        else {
            this.balance -= amount;
        }
    }
}

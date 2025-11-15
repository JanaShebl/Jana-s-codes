/*
      ██╗ █████╗ ███╗   ██╗ █████╗
      ██║██╔══██╗████╗  ██║██╔══██╗
      ██║███████║██╔██╗ ██║███████║
 ██   ██║██╔══██║██║╚██╗██║██╔══██║
 ╚█████╔╝██║  ██║██║ ╚████║██║  ██║
  ╚════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝
*/

import java.util.*;

public class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 * balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);

        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("Balance = " + a.getBalance());
        System.out.println("Monthly Interest: $" + a.getMonthlyInterestRate());
        System.out.println("Date Created: " + a.getDateCreated());
    }
}



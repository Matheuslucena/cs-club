package Programs.src.chapterFive;

/*
*   Program Name: Teste
*   Author: Matheus Marques
*   Class: CSC110
*   Date Written: 10/16/2025
*   Brief Description: -
*   Description of inputs: -
*   Description of outputs: Display Hello World
*/
public class BankAccount {
    private int acctNumber;
    private String name;
    private double balance;

    BankAccount() {
        this.acctNumber = 0;
        this.name = "Unknown";
        this.balance = 0.0;
    }

    BankAccount(int aNumber, String aName, double amount) {
        this.acctNumber = aNumber;
        this.name = aName;
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        return "Name: " + this.name + "\nAccount Number: " + this.acctNumber + "\nBalance: " + +this.balance;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctNumber() {
        return this.acctNumber;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }
}

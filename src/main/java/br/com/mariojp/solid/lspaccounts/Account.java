package br.com.mariojp.solid.lspaccounts;

public class Account {
	
	   protected double balance;

	 public Account(double balance) {
	      this.balance = balance; //construtor
	 }

	public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}
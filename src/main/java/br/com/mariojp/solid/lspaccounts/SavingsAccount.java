package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account {
    
	public SavingsAccount() {
		super(0.0); // mesma coisa do checking account aqui
	}
    public SavingsAccount(double balance) {
    	super(balance);
	} 
}
package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {
	
	   public CheckingAccount() {
	        super(0.0); // saldo inicial 0
	    }

	    public CheckingAccount(double balance) {
	        super(balance);
	    }

	@Override
    public void withdraw(double amount) {
    	if (amount <=balance) { 
    		throw new IllegalArgumentException("Saldo insuficiente"); //exceção caso o saldo seja insuficiente
    	}
        super.withdraw(amount); //utiliza o método withdraw da classe pai (ACCOUNT)
    }
}
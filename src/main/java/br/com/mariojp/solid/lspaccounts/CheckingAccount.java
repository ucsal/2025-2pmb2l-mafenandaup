package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {
	
	   public CheckingAccount() {
	        super(0.0); // definição do construtor (isso tava dando erro ao compilar o código) - onde valor incial é 0
	        // em caso de teste sem argumento
	    }

	    public CheckingAccount(double balance) {
	        super(balance);
	    }

	@Override
    public void withdraw(double amount) {
    	if (amount > balance) { 
    		throw new IllegalArgumentException("Saldo insuficiente"); //exceção caso o saldo seja insuficiente
    	}
        super.withdraw(amount); //utiliza o método withdraw da classe pai (ACCOUNT)
    }
}
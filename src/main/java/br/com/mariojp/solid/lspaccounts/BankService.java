package br.com.mariojp.solid.lspaccounts;

public class BankService {
	  // aceita withdrawable ao invés de account, só quem pode sacar é aceito
    private void processWithdrawal(Withdrawable wt, double amount){
        wt.withdraw(amount);
    }
    
    // esse método é compatível com os testes da main, porém só executa com as instâncias de conta capazes de sacar (ou seja, da interface withdrawable)
    public void processWithdrawal(Account account, double amount) {
        if (account instanceof Withdrawable) {
            processWithdrawal((Withdrawable) account, amount); // caso verdadeiro, o primeiro método é executadado.
        }
        //se não, não faz nada
    }
}
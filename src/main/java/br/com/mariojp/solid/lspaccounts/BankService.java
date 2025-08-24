package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Withdrawable wt, double amount){
        wt.withdraw(amount);
    }
    
    // Mantém compatibilidade com a Main e testes
    public void processWithdrawal(Account account, double amount) {
        if (account instanceof Withdrawable) {
            processWithdrawal((Withdrawable) account, amount);
        }
        // Caso contrário, não faz nada (SavingsAccount)
    }
}
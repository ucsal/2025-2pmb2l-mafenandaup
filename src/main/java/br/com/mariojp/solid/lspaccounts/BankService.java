package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processWithdrawal(Withdrawable wt, double amount){
        wt.withdraw(amount);
    }
}
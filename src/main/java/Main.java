import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        CheckingAccount acc1 = new CheckingAccount(1000);  //instâncias de objetos de BankService, CheckingAccount e SavingsAccount para testes
        SavingsAccount acc2 = new SavingsAccount(500); 

        bank.processWithdrawal(acc1, 200);
        System.out.println("Saldo conta corrente: " + acc1.getBalance());
        System.out.println("CONTA-CORREN: " + acc2.getBalance());
    }
}

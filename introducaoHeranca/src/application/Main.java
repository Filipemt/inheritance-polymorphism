package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        /*
        Account acc = new Account(1001, "Filipe", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Gustavo", 0.0, 500.00);

            UPCASTING
            Pegando um objeto de alguma subclasse e atribuindo para uma variável
            da super classe

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Simone", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Maria", 200.0, 0.01);

            DOWNCASTING
            Pegando um objeto de alguma superclasse e atribuindo para a subclasse.
            processo inverso de Upcasting

         BusinessAccount acc4 = (BusinessAccount) acc2; // Fazendo DownCasting manual
         acc4.loan(100.0);

         BusinessAccount acc5 = (BusinessAccount) acc3; Objeto acc3 não é de BusinessAccount, então o downcasting não é possivel

         if (acc3 instanceof BusinessAccount) { // fazendo validação e aprendendo sobre o intanceof
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
         }

          if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
            }

            */

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Alex", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Alex", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
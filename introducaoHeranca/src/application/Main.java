package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Filipe", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Gustavo", 0.0, 500.00);

        /*
            UPCASTING
            Pegando um objeto de alguma subclasse e atribuindo para uma variável
            da super classe
         */

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Simone", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Maria", 200.0, 0.01);
    }
}
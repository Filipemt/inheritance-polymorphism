package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the numbers os tax players: ");
        int numberOfTaxPayers = sc.nextInt();

        for (int i = 1; i<=numberOfTaxPayers; i++) {
            System.out.println("Tax payers #" + i + " data:");

            System.out.print("Individual or Company (i/c)? ");
            char type = sc.next().toUpperCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'I') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }

        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");

        for (TaxPayer taxPayer : list) {
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.tax()));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));

        sc.close();

    }
}
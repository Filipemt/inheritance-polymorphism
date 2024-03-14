package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number os employees: ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 1; i<=numberOfEmployees; i++) {
            System.out.println("Employye #" + i + " data:");

            System.out.print("Outsourced? (y/n) ");
            char outsourced = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String EmployeeName = scanner.nextLine();

            System.out.print("Worked hours: ");
            int workedHours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (outsourced == 'y' ) {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();

                employeeList.add(new OutsourcedEmployee(EmployeeName, workedHours, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee(EmployeeName, workedHours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        scanner.close();

    }
}
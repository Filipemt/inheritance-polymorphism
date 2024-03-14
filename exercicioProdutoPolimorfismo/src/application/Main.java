package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Product> productList = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numbersOfProducts = sc.nextInt();

        System.out.println("-------------------------------------");

        System.out.println("Common product, enter the letter (C)");
        System.out.println("Used product, enter the letter (U)");
        System.out.println("Imported product, enter the letter (I)");

        System.out.println("-------------------------------------");

        for (int i=1; i<=numbersOfProducts; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println();

            System.out.print("Your product is common, used or imported? ");
            char typeProduct = sc.next().toUpperCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (typeProduct == 'C') {
                productList.add(new Product(name, price));
            }

            else if (typeProduct == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                productList.add(new UsedProduct(name, price, date));
            }
            else  {
                System.out.print("Costoms fee: ");
                double costomsFee = sc.nextDouble();

                productList.add(new ImportedProduct(name, price, costomsFee));
            }
        }


        System.out.println("-------------------------------------");

        System.out.println("PRICE TAGS: ");

        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
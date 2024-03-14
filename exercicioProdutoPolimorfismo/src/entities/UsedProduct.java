package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufractureDate;

    public UsedProduct() {}

    public UsedProduct(String name, Double price, LocalDate manufractureDate) {
        super(name, price);
        this.manufractureDate = manufractureDate;
    }

    public LocalDate getManufractureDate() {
        return manufractureDate;
    }

    public void setManufractureDate(LocalDate manufractureDate) {
        this.manufractureDate = manufractureDate;
    }

    @Override
    public String priceTag() {
        return getName()
               + " (used) $ "
               + String.format("%.2f", getPrice())
               + " (Manufacture date: "
               +  manufractureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
               + ")";
    }
}

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Furniture {
    private String name;
    private BigDecimal price;
    private double vatRate;

    public Furniture(String name, BigDecimal price, double vatRate) {
        this.name = name;
        this.price = price;
        this.vatRate = vatRate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getPriceIncludingVat() {
        BigDecimal vatAmount = price.multiply(BigDecimal.valueOf(vatRate));
        return price.add(vatAmount);
    }
}


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private double area;
    private List<Furniture> furnitureList;

    public Room(double area) {
        this.area = area;
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public BigDecimal getTotalPriceIncludingVat() {
        BigDecimal totalPriceIncludingVat = BigDecimal.ZERO;
        for (Furniture furniture : furnitureList) {
            totalPriceIncludingVat = totalPriceIncludingVat.add(furniture.getPriceIncludingVat());
        }
        return totalPriceIncludingVat;
    }

    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", new BigDecimal("100"), 0.23);
        Furniture table = new Furniture("Table", new BigDecimal("200"), 0.23);

        Room room = new Room(20.0);
        room.addFurniture(chair);
        room.addFurniture(table);

        BigDecimal totalPriceIncludingVat = room.getTotalPriceIncludingVat();
        System.out.println("Total Price (including VAT) of all furniture in the room: " + totalPriceIncludingVat);
    }
}

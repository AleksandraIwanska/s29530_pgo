import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Book"));
        itemList.add(new Item(2, "Pen"));
        itemList.add(new Item(3, "Notebook"));
        itemList.add(new Item(4, "Pencil"));
        itemList.add(new Item(5, "Eraser"));

        for (int i = 1; i <= 10; i++) {
            itemList.add(new Item(i, "Item " + i));
        }

        for (Item item : itemList) {
            item.show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }
        List<Item> sublist = itemList.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(sublist);

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            int itemId = entry.getKey();
            String itemName = entry.getValue();
            System.out.println("Item ID: " + itemId + ", Item Name: " + itemName);
        }
    }
}

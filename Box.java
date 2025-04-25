import java.util.ArrayList;
import java.util.List;

public class Box {
    private static int count = 1;
    private int boxId;
    private double maxWeight;
    private double currentWeight;
    private List<Item> items;

    public Box(double maxWeight) {
        this.boxId = count++;
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
            return true;
        }
        return false;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public int getBoxId() {
        return boxId;
    }

    @Override
    public String toString() {
        return "Box " + boxId + " - Items: " + items + " | Total: " + currentWeight + "kg";
    }
}

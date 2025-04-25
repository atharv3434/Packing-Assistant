import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PackingManager {
    public static List<Box> packItems(List<Item> items, double maxWeightPerBox) {
        List<Box> packedBoxes = new ArrayList<>();

        // Sort items by descending weight
        Collections.sort(items, Comparator.comparingDouble(Item::getWeight).reversed());

        for (Item item : items) {
            boolean packed = false;

            // Try to fit into existing boxes
            for (Box box : packedBoxes) {
                if (box.addItem(item)) {
                    packed = true;
                    break;
                }
            }

            // Create new box if item didn't fit
            if (!packed) {
                Box newBox = new Box(maxWeightPerBox);
                newBox.addItem(item);
                packedBoxes.add(newBox);
            }
        }

        return packedBoxes;
    }
}

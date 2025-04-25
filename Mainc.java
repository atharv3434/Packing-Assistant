import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        System.out.print("Enter max weight per box: ");
        double maxWeight = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter item weight: ");
            double weight = sc.nextDouble();
            sc.nextLine(); // consume newline

            items.add(new Item(name, weight));
        }

        List<Box> boxes = PackingManager.packItems(items, maxWeight);

        System.out.println("\n📦 Packing Summary:");
        for (Box box : boxes) {
            System.out.println(box);
        }

        ReportWriter.saveReport(boxes);
    }
}

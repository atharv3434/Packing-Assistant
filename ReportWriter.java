import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportWriter {
    public static void saveReport(List<Box> boxes) {
        try (FileWriter writer = new FileWriter("packing_report.txt")) {
            for (Box box : boxes) {
                writer.write("Box " + box.getBoxId() + ":\n");
                for (Item item : box.getItems()) {
                    writer.write(" - " + item.getName() + " (" + item.getWeight() + "kg)\n");
                }
                writer.write("Total Weight: " + box.getCurrentWeight() + "kg\n\n");
            }
            System.out.println("✅ Report saved to packing_report.txt");
        } catch (IOException e) {
            System.out.println("❌ Error saving report: " + e.getMessage());
        }
    }
}

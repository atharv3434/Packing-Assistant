# Packing-Assistant


📦 Packing Assistant: Smart Box Organizer 
🧠 Project Idea:
When you're moving or shipping items, figuring out how to fit everything into limited boxes is a real-world problem. This Java project helps users optimize the packing of items into boxes based on weight or volume constraints.

🎯 Features:
User enters a list of items with weight and volume.

Define max weight/volume of each box.

The app smartly assigns items to boxes using a simple greedy algorithm.

Displays how many boxes are used and what’s in each box.

Saves the packing report to a .txt file.

📌 Tech Concepts Covered:
OOP (classes like Item, Box, PackingManager)

File handling (report generation)

Greedy algorithm

Lists and loops

🗂️ File Structure

PackingAssistant/
├── Item.java
├── Box.java
├── PackingManager.java
├── ReportWriter.java
└── Main.java


🧱 Example Output

Enter max weight per box: 10
Enter number of items: 3
Item 1 name: Books
Weight: 5
Item 2 name: Laptop
Weight: 4
Item 3 name: Dumbbell
Weight: 7

📦 Packing Summary:
Box 1: Books, Laptop (Total: 9kg)
Box 2: Dumbbell (Total: 7kg)

Report saved to packing_report.txt ✅

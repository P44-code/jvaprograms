import java.util.HashMap;

public class InventoryMap {
    public static void main(String[] args) {
        // Create a HashMap where Key is a String (product) and Value is an Integer (quantity)
        HashMap<String, Integer> inventory = new HashMap<>();

        // 1. Adding elements (put)
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 20);

        // 2. Updating a value
        inventory.put("Apples", 45); // Overwrites the old value of 50

        // 3. Checking if a key exists
        String searchItem = "Bananas";
        if (inventory.containsKey(searchItem)) {
            // 4. Retrieving a value (get)
            int quantity = inventory.get(searchItem);
            System.out.println("We have " + quantity + " " + searchItem + " left.");
        }

        // 5. Removing an item
        inventory.remove("Oranges");

        // 6. Iterating through the entire HashMap
        System.out.println("\n--- Current Inventory ---");
        for (String key : inventory.keySet()) {
            System.out.println(key + ": " + inventory.get(key));
        }
    }
}


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GuenthersMarket {
	


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// treeMap orders by alphabet i guess??
		TreeMap <String, Double> itemsPrices = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
		
		
		// welcome, want to view the menu?
		System.out.println("Welcome to Guenther's Market");
		
		
		
			groceryMenu(itemsPrices);
		
		//user selections
		System.out.println("\nPlease make your selection(s):");
		String order = scnr.nextLine();
		
		
		
		if (itemsPrices.containsKey(order)) {
			
				System.out.println("Added " + order + " to your order at $" + itemsPrices.get(order));
			
		} else if (itemsPrices.containsKey(orderFormatter(order))) {	
	
				System.out.println("Added " + order + " to your order at $" + itemsPrices.get(order));
			
		} else {
			System.out.println("The item does not exist, please try again.");
		}
		


		scnr.close();
	}
	
	public static TreeMap <String, Double> groceryMenu(TreeMap <String, Double> itemsPrices) {
		System.out.printf("%-16s%-15s%n", "Item", "Price");
		System.out.println("---------------------");
		itemsPrices.put("Broccoli", 1.89);
		itemsPrices.put("Cauliflower", 2.79);
		itemsPrices.put("Bell pepper", .99);
		itemsPrices.put("Cabbage\t", 1.29);
		itemsPrices.put("Potato\t", .69);
		itemsPrices.put("Onion\t", .79);
		itemsPrices.put("Leek\t", 2.59);
		itemsPrices.put("Mushrooms", 1.99);
		//if ()
		itemsPrices.forEach((k,v) -> System.out.println(k + '\t' +"$" + v));
		return itemsPrices;
		
	}
	public static void groceryOrder(String order, TreeMap <String, Double> itemsPrices) {
		
		
		TreeMap <String, Double> orderTally = new TreeMap<>();
		
	
		
	
		
	}
	public static String orderFormatter (String order) {
		if (order.contains("Cabbage")) {
			order = "Cabbage\t";
		} else if (order.contains("Potato")) {
			order = "Potato\t";
		} else if (order.contains("Onion")) {
			order = "Onion\t";
		} else if (order.contains("Leek")) {
			order = "Leek\t";
		}
		return order;
	}
}


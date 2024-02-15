import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lambda {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Onions");
        shoppingList.add("Bread");
        shoppingList.add("Flour");
        shoppingList.add("Sugar");
        shoppingList.add("Chicken");
// Print out each item in the shopping list using Java 8's
// forEach
        shoppingList.forEach(System.out::println);
    }
}
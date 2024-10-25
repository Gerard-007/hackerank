import java.util.Map;
import java.util.HashMap;

public class DictionaryPractice {
    public static void main(String[] args){
        Map<String, String> userMap = new HashMap<String, String>();

        // Putting things inside our dictionary...
        userMap.put("ID", "007");
        userMap.put("Name", "Gerard Nwazk");
        userMap.put("Email", "gnwazk@gmail.com");
        userMap.put("Phone", "08062134747");
        userMap.put("Occupation", "Developer");

        // Retrieving things from our dictionary...
        System.out.println(userMap.get("ID"));
        System.out.println(userMap.get("Name"));
        System.out.println(userMap.get("Email"));
        System.out.println(userMap.get("Phone"));
        System.out.println(userMap.get("Occupation"));

        // Printing all the keys
        System.out.println(userMap.keySet());

        // Printing all the values
        System.out.println(userMap.values());

        // Print size of the dictionary
        System.out.printf("Size of our dictionary is %d\n", userMap.size());

        // Shopping list...
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Add item to shoppingList...
        shoppingList.put("Shirt", true);
        shoppingList.put("Trouser", Boolean.TRUE);
        shoppingList.put("Shoe", Boolean.FALSE);
        shoppingList.put("Phone", Boolean.TRUE);
        shoppingList.put("eggs", false);

        // Retrieve shopping items...
        shoppingList.get("Shoe");
        shoppingList.get("Trouser");

        // remove from shoppingList
        shoppingList.remove("eggs");

        // replace from shoppingList
        shoppingList.replace("eggShoes", Boolean.TRUE);

        // Key-Value pairs printout...
        System.out.println(shoppingList.toString());

        // Clear shopping cart...
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        // Check shopping list is empty
        System.out.println(shoppingList.isEmpty());
    }
}
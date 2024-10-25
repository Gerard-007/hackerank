import java.io.*;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        //names phone numbers = friends
        // If entry not fount print not found
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter name of friend: ");
            String name = scanner.next();
            System.out.print("Enter phone number of friend: ");
            String phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }
        System.out.println(phoneBook);

        while (scanner.hasNextLine()) {
            System.out.print("Enter a name of friend to search: ");
            String key = scanner.next();
            if (phoneBook.get(key)) {
                System.out.println(key + "=" + phoneBook.get(key));
            } else {
                System.out.print("Not found.");
            }
        }
    }
}
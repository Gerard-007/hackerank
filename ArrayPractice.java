import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String... args) {
        int[] intArray1; //Declaring
        int[] intArray2 = new int[4]; //Allocating
        int[] intArray3 = {5, 2, 1, 0}; //Initializing

        String[] shoppingList = {"apples", "bananas", "grape"};

        intArray2[0] = 10;
        intArray2[1] = 20;
        intArray2[2] = 30;
        intArray2[3] = 40;

        System.out.println(Arrays.toString(shoppingList));
        // custom print out arrays
        printList(intArray2);
        printList(intArray3);

        // Retrieve objects
        System.out.println("Retrieve objects");
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 2));

        // Given functions
        System.out.println("Given functions Array.sort()");
        Arrays.sort(intArray3);
        printList(intArray3);

        // Print sting array
        System.out.println("Print sting array");
        printList(shoppingList);

        // Advance for loop
        System.out.println("Advance for loop");
        for(String s : shoppingList) {
            System.out.println(s);
        }
    }

    public static void printList(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        //System.out.println(Arrays.toString(array));
    }

    public static void printList(String[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        //System.out.println(Arrays.toString(array));
    }
}

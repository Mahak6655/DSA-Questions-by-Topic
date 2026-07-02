
import java.util.*;

public class sizeOfArraylist {

    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the total number of elements in the ArrayList
        System.out.println("Size of list = " + list.size());

        // Traverse the ArrayList using a for loop
        // and print each element
        System.out.print("ArrayList Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}


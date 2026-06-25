
import java.util.*;

public class treeHashSet {

    public static void main(String[] args) {

        // Creating a TreeSet
        // TreeSet stores only unique elements
        // and automatically sorts them in ascending order
        TreeSet<String> ths = new TreeSet<>();

        // Adding city names to the TreeSet
        ths.add("Delhi");
        ths.add("Mumbai");
        ths.add("Noida");
        ths.add("Bengaluru");

        // Printing the TreeSet
        // Output will be sorted alphabetically
        System.out.println(ths);
    }
}

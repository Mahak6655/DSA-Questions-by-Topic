
import java.util.*;

public class linkedHashSet {

    public static void main(String[] args) {

        // Creating a LinkedHashSet
        // LinkedHashSet stores only unique elements
        // and maintains the insertion order
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        lhs.add(2);
        lhs.add(4);
        lhs.add(6);
        lhs.add(10);
        lhs.add(8);

        // Printing the LinkedHashSet
        // Elements will be displayed in the order they were inserted
        System.out.println(lhs);
    }
}


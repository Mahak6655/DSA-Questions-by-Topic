
import java.util.HashSet;
import java.util.Iterator;

public class iterationOnHashset {

    public static void main(String[] args) {

        // Creating a HashSet
        // HashSet stores unique elements and does not maintain insertion order
        HashSet<Integer> hs = new HashSet<>();

        // Adding elements to the HashSet
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // ---------------- ITERATION USING ITERATOR ----------------

        // Creating an Iterator object
        Iterator it = hs.iterator();

        // Traverse the HashSet using hasNext() and next()
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // ---------------- ITERATION USING ENHANCED FOR LOOP ----------------

        // Traverse the HashSet using a for-each loop
        for (Integer i : hs) {
            System.out.print(i + " ");
        }
    }
}


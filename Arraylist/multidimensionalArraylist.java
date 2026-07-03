
import java.util.*;

public class multidimensionalArraylist {

    public static void main(String[] args) {

        // Create a 2D ArrayList (ArrayList of ArrayLists)
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        // Create individual ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        /*
         * Method 1:
         * Manually add elements to each ArrayList.
         * Uncomment the code below if you want to use this approach.
         */

        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // mainlist.add(list1);

        // list2.add(4);
        // list2.add(5);
        // list2.add(6);
        // mainlist.add(list2);

        // list3.add(7);
        // list3.add(8);
        // list3.add(9);
        // mainlist.add(list3);

        /*
         * Method 2:
         * Fill the ArrayLists using loops.
         */

        for (int i = 1; i <= 5; i++) {

            // Add multiples of 1
            list1.add(i);

            // Add multiples of 2
            list2.add(i * 2);

            // Add multiples of 3
            list3.add(i * 3);
        }

        // Add all the lists to the main 2D ArrayList
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // Print all elements of the 2D ArrayList row by row
        System.out.println("Elements of 2D ArrayList:");

        for (int i = 0; i < mainlist.size(); i++) {

            // Get the current ArrayList
            ArrayList<Integer> currList = mainlist.get(i);

            // Print each element of the current list
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}

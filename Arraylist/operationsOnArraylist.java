import java.util.*;
public class operationsOnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elemennt O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //get element O(1)
        System.out.println(list.get(2));

        //delete O(n)
        System.out.println(list.remove(4));
        System.out.println(list);

        //set element at index O(n)
        list.set(2, 10);
        System.out.println(list);

        //contains elsement O(n);
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));
    }
}

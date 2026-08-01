import java.util.Arrays;

public class reverseArray {
    public static int[] reverseAnArray(int arr[]){
        int s = 0;
        int e = arr.length-1;

        while (s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseAnArray(arr)));
    }

}

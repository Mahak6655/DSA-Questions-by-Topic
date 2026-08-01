import java.util.*;
public class largestElement {

    public static int[] largestSmallest(int arr[]){
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > l){
                l = arr[i];
            }
            if(arr[i] < s){
                s = arr[i] ;
            }
        }
        return new int[] {l,s}; 
    }
    public static void main(String[] args) {
        int arr[] = {4,6,8,12,5,6,9};
        System.out.println(Arrays.toString(largestSmallest(arr)));
    }
}

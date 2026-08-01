import java.util.*;
public class hasRepeatedElement {

    public static boolean containDuplicate(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return true;
        }
        return false;
    }

    //or 
    public static boolean containDuplicatePart2(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])) return  true;
            else{
                hs.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containDuplicatePart2(arr));
    }
}

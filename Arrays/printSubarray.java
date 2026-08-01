import java.util.*;
public class printSubarray {
    public static void printSubArray(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ts = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                ts++;
                min = Math.min(min, sum);
                max = Math.max(max, sum);
                System.out.println("Sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ts);
        System.out.println("Minimum sum = "+min);
        System.out.println("Maximum sum = "+max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }
    
}
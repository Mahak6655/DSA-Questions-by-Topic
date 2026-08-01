public class prefixSubarray {

    public static void prefixSubarray(int arr[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix [] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0? prefix[j]:prefix[j]-prefix[i-1];
            }
            max = Math.max(max, currSum);
        }
        System.out.println("Max == "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefixSubarray(arr);
    }
}

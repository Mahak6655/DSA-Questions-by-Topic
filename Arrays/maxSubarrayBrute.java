public class maxSubarrayBrute {

    public static void printMAxSubbary(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        printMAxSubbary(arr);
    }
}

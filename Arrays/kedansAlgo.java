public class kedansAlgo {

    public static void maxSubaarayUsingKedans(int arr[]){
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            max = Math.max(max, cs);
            if(cs<0){
                cs = 0; 
            }
        }
        System.out.println(max);
    }

    //another version also print the series of the array that give us maximum sum

    public static void seriesMAxSubbaray(int arr[]){
        int cs = 0;
        int max =Integer.MIN_VALUE;

        int start =0, end= 0, tempStart =0;

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];

            if(cs>max){
                max = cs;
                start = tempStart;
                end = i;
            }
            if(cs<0){
                cs = 0;
                tempStart = i+1;
            }
        }
        System.out.println("Maximun sum = "+max);
        System.out.print("series = ");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        seriesMAxSubbaray(arr);
    }
}

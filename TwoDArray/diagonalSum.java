package TwoDArray;

public class diagonalSum {

    public static int printDigonalSum(int arr[][]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j == arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    //optimized
    public static int optimizedDiagonalSum(int arr[][]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){

            //pd
            sum+=arr[i][i];

            //sd
            if(i!=arr.length-1-i){
            sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(optimizedDiagonalSum(arr));
    }
}

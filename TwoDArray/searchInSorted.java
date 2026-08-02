package TwoDArray;

public class searchInSorted {

    public static boolean searchInSoretedMatrix(int arr[][],int k){
        int row = 0;
        int col = arr[0].length-1;

        while (row<arr.length && col>=0) {
            if(arr[row][col] == k){
                System.out.println("found key at ("+row+" "+","+col+")");
                return true;
            }
            else if(k<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    //way 2

  
    public static boolean searchInSoretedMatrixTwo(int arr[][],int k){
        int row = arr.length-1;
        int col = 0;

        while (row>=0 && col<arr.length) {
            if(arr[row][col] == k){
                System.out.println("found key at ("+row+" "+","+col+")");
                return true;
            }
            else if(k<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(searchInSoretedMatrixTwo(arr, 33));
    }
    
}

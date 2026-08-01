public class linearSearch{
    public static int linearSearcInhArray(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,7,10};
        System.out.println(linearSearcInhArray(arr, 10));
    }
}
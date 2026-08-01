public class binarysearch {

    public static int binarySearch(int arr[],int k){
        int s = 0;
        int e = arr.length;

        while (s<=e) {
            int mid = (s+e)/2;

            if(arr[mid] == k)return mid;
            else if(arr[mid]>k ) e= mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(binarySearch(arr, 4));
    }
}

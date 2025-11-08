package _07_binarySearch;
// self
public class _01_BinarySearch_ierative {
    static void main(String[] args) {
        int[] arr = {10,15,21,34,81,105,180,500};
        int target = 105 ;
        int index = Binarysearch(arr , target);
        if(index == -1 ) System.out.println("target not found !");
        else System.out.println("target is at index : "+index);
    }
    public static int Binarysearch(int[] arr , int target ){
        int low = 0 , high = arr.length -1 ;
        while(low <= high){
//            int mid = (low+high )/2;
            int mid = low + (high -low)/2;
            if(arr[mid]==target) return mid ;
            else if(arr[mid]<target) low = mid+1; // go right
            else high = mid-1 ;// go left
        }
        return -1 ; // arge not found
    }
}

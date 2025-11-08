package _07_binarySearch;

// self

public class _02_BinarySearch_recursive {
    static void main(String[] args) {
        int[] arr = {10,15,21,34,81,105,180,500};
        int target = 20 ;
        int low = 0 , high = arr.length -1 ;
        int index = binarySearchRecursive(arr, low ,high ,target);
        if(index == -1 ) System.out.println("target not found !");
        else System.out.println("target is at index : "+index);
    }
    public static int binarySearchRecursive(int[] arr , int low , int high , int target ){
        if(low<=high){
            int mid = (low+high )/ 2 ;
            if(arr[mid]==target) return mid ;
            else if (arr[mid]<target)
                return binarySearchRecursive(arr, mid+1, high,target);
            else
                return binarySearchRecursive(arr,low,mid-1 , target);
        }
        return -1 ; // element not found
    }
}

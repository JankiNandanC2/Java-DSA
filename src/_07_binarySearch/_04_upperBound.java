package _07_binarySearch;

public class _04_upperBound {
    static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int x = 30 ;
        System.out.println("upper bound of x is : "+upperBound(arr,x));
    }
    public static int upperBound(int[] arr , int x ){
        int ub = arr.length;
        int low = 0 , high = arr.length - 1 ;
        while(low <= high){
            int mid = low + ((high - low )/2);
            if (arr[mid] > x) {
                ub = Math.min(ub , mid);
                high = mid-1 ;
            }
            else low = mid + 1 ;
        }
       return ub ;
    }
}

package _07_binarySearch;

// kisi online platform par v solve karna h

public class _03_lowerBound {
    static void main(String[] args) {
        int[] arr ={10,20,30,30,40,50,60,70,80,90} ;
        int n = arr.length ;
        int x = 95;
        int lb  = lowerBound(arr,x);
        System.out.println("lower Bound = "+lb);
    }
    public static int lowerBound(int[] arr , int x){
        int lb = arr.length ;
        int low =0 , high = arr.length - 1 ;
        while(low<=high) {
            int mid=low+((high-low)/2);
            if(arr[mid]>=x){ // check left half
                lb = Math.min(lb,mid);
                high = mid-1 ;
            }
            else { // check right half
                low = mid+1;
            }
        }
        return lb;
    }
}


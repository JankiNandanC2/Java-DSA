package _07_binarySearch;
// you can solve it by linear search but time complexity will be O(n) --- solve it in log(n)
// solved n leetcode
public class Leetcode33_searchInRRotatedArray {
   /*  // O(n) complexity
    public static int searchInRotatedArray(int[] arr , int target){
        int pivotIndx = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]== target )
                return i ;
        }
        return pivotIndx ;
    }
    */
    static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2, 3};
        int target = 7 ;
        int indx = searchInRotatedArray(arr , target) ;
        System.out.println(indx);
    }
    private static int searchInRotatedArray(int[] arr, int target) {
        int pvt = -1 ;
        
        return -1 ;
    }
}

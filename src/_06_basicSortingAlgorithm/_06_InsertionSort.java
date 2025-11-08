package _06_basicSortingAlgorithm;



public class _06_InsertionSort {
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {3, 5, 1, 4, 2};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int n = arr.length;
    // method 1 using 2 for loop
        /*
//        for (int i = 1; i < n; i++) {
//            for(int j = i ; j >=1 ; j-- ){
//                if (arr[j] < arr[j - 1]) {
//                    swap(arr, j ,j-1);
//                }
//                else break ;
//            }
//        }
        for (int i = 1; i < n; i++) {
            for(int j = i ; j >=1 && arr[j] < arr[j-1] ; j-- ){
                swap(arr, j ,j-1);
            }
        }
         */

        // method 2 using inner while loop
        for (int i = 1; i < n; i++) {
            int j = i ;
            /*
            while(j>0){
                if(arr[j]<arr[j-1]){
                    swap(arr, j , j-1);
                    j--;
                }
                else break ;
            }
             */
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j , j-1);
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

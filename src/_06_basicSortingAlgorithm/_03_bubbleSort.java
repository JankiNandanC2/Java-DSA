package _06_basicSortingAlgorithm;

public class _03_bubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
//       int[] arr = {3,1,2,5,4} ;
//        int[] arr = {5, 1, 3, 4, 2};
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length;
        print(arr);
    // case 1
        /*
        for (int x = 0; x < n-1 ; x++) {
            for (int i = 0; i < n - 1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
         */
    // case 2  optimised
        /*
        for (int x = 0; x < n-1 ; x++) {
            for (int i = 0; i < n -x- 1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
         */
    // case 3 more optimised
        for (int x = 0; x < n-1 ; x++) {
            boolean flag = true ;
            for (int i = 0; i < n -x- 1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false ;
                }
            }
            if(flag==true) break ; // its sorted
        }
        print(arr);
    }
}
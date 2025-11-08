package _06_basicSortingAlgorithm;

public class _05_SelectionSort {
    static void main(String[] args) {
        int[] arr ={10,-4,20,1,8,-6};
        int n = arr.length;
    // min element in array
        /*
        int mn = arr[0];
        int mnIndx=-1;
        for(int i = 1 ; i<n ; i++){
//            mn = Math.min(mn ,arr[i]);
            if(arr[i]<mn){
                mn = arr[i];
                mnIndx=i;
            }
        }
        System.out.println("min elememt is : "+mn);
        System.out.println("and its index is "+mnIndx);
         */
        for (int i = 0; i < n-1; i++) {
            int min=Integer.MAX_VALUE ;
            int minIndex = -1 ;
            for (int j = i; j < n; j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //  swap minIndex and i th element of array
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp ;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

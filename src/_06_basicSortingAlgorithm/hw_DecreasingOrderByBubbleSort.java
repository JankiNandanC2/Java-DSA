package _06_basicSortingAlgorithm;

public class hw_DecreasingOrderByBubbleSort {
    static void main(String[] args) {
        int[] arr  = {3,1,2,5,4};
        int n = arr.length ;
        for(int i = 0 ;i<n-1 ; i++){
            boolean flag = true ;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp ;
                    flag = false ;
                }
            }
            if(flag) break ; // flag rue hone par break hoga qunki swapping nhi hua h us iteration me tlv  sort hogya
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

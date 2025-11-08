package _06_basicSortingAlgorithm;

public class _01_checkIfArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {1,7,3,8,9,13};
        int n = arr.length ;
        boolean flag = true ;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break ;
            }
        }
        System.out.println("array is sorted : "+flag);
    }
}

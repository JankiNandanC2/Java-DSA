package _01_Array;

public class _21_sortZeroOneMethod2 {
    public static void main(String[] args) {
//        int[] arr = {1 ,0, 0,1,1,1,0,0,1,0};
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        int i = 0 ;
        int j = n-1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] ==1) j--;
            else if(arr[i] ==1 && arr[j]== 0){
//                int temp = arr[i];
//                arr[i]= arr[j];
//                arr[j]= temp;
                arr[i]= 0 ;
                arr[j] = 1 ;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}

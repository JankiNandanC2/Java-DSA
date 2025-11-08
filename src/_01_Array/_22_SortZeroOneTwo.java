package _01_Array;
// two pass solution method
public class _22_SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        int noOfZero = 0;
        int noOfOne = 0;
//        int noOfTwo = 0; ///---> not needed

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==0) noOfZero++;
            else if(arr[i]==1) noOfOne++;
//            else noOfTwo++;
        }

        for(int i = 0 ; i< arr.length; i++){
            if(i < noOfZero) arr[i]=0;
            else if (i< ( noOfZero + noOfOne)) arr[i]=1 ;
            else arr[i]= 2 ;
        }

        System.out.println();
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}

package _02_MultidimensionalArraays;

public class _02_basics {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        for(int ele :a){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[][] arr = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
//        int m = arr.length;
//        int n = arr[0].length;
//        for(int i = 0 ; i<m  ; i++){
//            for(int j = 0 ; j<n ;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // output using for each loop
        System.out.println();
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}

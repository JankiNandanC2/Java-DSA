package _02_MultidimensionalArraays;
// largest, smallest , sum , product
public class _04_LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{10, 33, 33}, {43, 53, 14},{73,38,90}};
        int n= arr[0].length ,m = arr.length;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int sum = 0 ;
        int product= 1;
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                mx = Math.max(mx , arr[i][j]);
                mn = Math.min(mn ,arr[i][j] );
                sum+= arr[i][j] ;
                product*= arr[i][j] ;
            }
        }

        // using for each loop
//        for (int[] ints : arr) {
//            for(int x : ints) {
//                mx = Math.max(mx , x);
//                mn = Math.min(mn ,x );
//                sum+= x ;
//                product*= x ;
//            }
//        }
        System.out.println("largest element is : "+mx);
        System.out.println("smallest element is : "+mn);
        System.out.println("sum of  element is : "+sum);
        System.out.println("Product of element is : "+product);
    }
}

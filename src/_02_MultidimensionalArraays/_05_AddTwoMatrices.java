package _02_MultidimensionalArraays;

public class _05_AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,9,2,},{3,7,4},{8,9,6}};
        int[][] b ={{9,3,7},{8,6,5},{2,4,9}};
        int m =a.length , n = a[0].length;

//        int[][] res = new int[m][n];
//        for(int i = 0 ;  i<m ; i++){
//            for( int j = 0 ; j<n ; j++){
//                res[i][j]= a[i][j]+b[i][j];
//            }
//        }
//        for(int i = 0 ;  i<m ; i++){
//            for( int j = 0 ; j<n ; j++){
//                System.out.print(res[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println();

        // simply display the sum
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                System.out.print(( a[i][j] + b[i][j] ) +" ");
            }
            System.out.println();
        }
        System.out.println();

        // store in array a without creating new array
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                a[i][j]= a[i][j]+b[i][j];
            }
        }
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

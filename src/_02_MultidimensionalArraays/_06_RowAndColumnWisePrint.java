package _02_MultidimensionalArraays;
// good concept
public class _06_RowAndColumnWisePrint {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4},{5,6}};
        int m =a.length , n = a[0].length;
        // row wise print
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // column wise print
        for( int j = 0 ; j<n ; j++){
            for(int i = 0 ;  i<m ; i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // new array me transpose store kar k display karna
        int[][] transpose = new int[n][m];
        for( int i = 0 ; i<n ; i++){
            for(int j = 0 ;  j<m ; j++){
               transpose[i][j] =a[j][i] ;
                System.out.print(transpose[i][j]+" ");
            }
        }
    }
}

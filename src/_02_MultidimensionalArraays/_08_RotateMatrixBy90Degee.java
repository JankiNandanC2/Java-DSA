package _02_MultidimensionalArraays;

import static _02_MultidimensionalArraays._07_TransformIntoTranspose.print;

public class _08_RotateMatrixBy90Degee {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m =arr.length , n = arr[0].length;
        for(int i = 0 ;  i<m ; i++){
            for( int j = 0 ; j<i ; j++){
                swap(arr , i , j);
            }
        }
        print(arr);
        for(int  i = 0 ; i < m ; i++){
            int a = 0 , b = n-1 ;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a]= arr[i][b] ;
                arr[i][b] = temp ;
                a++;
                b--;
            }
        }
      print(arr);
    }
    public static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]= temp ;
    }

}

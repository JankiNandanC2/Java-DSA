package _02_MultidimensionalArraays;
// done by self
public class _10_MatrixSpiral {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11, 12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int min_row = 0 , max_row =arr.length-1;
        int min_col = 0 , max_col = arr[0].length-1;
        while(min_row <= max_row && min_col <= max_col){
            // right sid move in matrix --> min-row constant
            for (int j = min_col; j <= max_col; j++) {
                System.out.print(arr[min_row][j]+" ");
            }
            min_row++;
            // move down ---> max_col constant
            if(min_row>max_row || min_col > max_col ) break;
            for (int k = min_row; k <= max_row; k++) {
                System.out.print(arr[k][max_col]+" ");
            }
            max_col--;
            // left side move krnge tv --> max_row constant
            if(min_row>max_row || min_col > max_col ) break;
            for (int l = max_col; l >= min_col ; l--) {
                System.out.print(arr[max_row][l]+" ");
            }
            max_row--;
            // move up in the matrix ---> min_col constant
            if(min_row>max_row || min_col > max_col ) break;
            for (int m = max_row; m >= min_row ; m--) {
                System.out.print(arr[m][min_col]+" ");
            }
            min_col++;
        }

    }
}
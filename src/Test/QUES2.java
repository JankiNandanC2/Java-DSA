package Test;

import java.util.Scanner;

public class QUES2 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},{6,7,8,9,10},{11, 12,13,14,15},{16,17,18,19,20}};
        int min_row = 0 , max_row =arr.length-1;
        int min_col = 0 , max_col = arr[0].length-1;
        while(min_row <= max_row && min_col <= max_col){
            // right
            for (int j = min_col; j <= max_col; j++) {
                System.out.print(arr[min_row][j]+" ");
            }
            min_row++;
            // move down
            if(min_row>max_row || min_col > max_col ) break;
            for (int k = min_row; k <= max_row; k++) {
                System.out.print(arr[k][max_col]+" ");
            }
            max_col--;
            // left
            if(min_row>max_row || min_col > max_col ) break;
            for (int l = max_col; l >= min_col ; l--) {
                System.out.print(arr[max_row][l]+" ");
            }
            max_row--;
            // move
            if(min_row>max_row || min_col > max_col ) break;
            for (int m = max_row; m >= min_row ; m--) {
                System.out.print(arr[m][min_col]+" ");
            }
            min_col++;
        }
    }
}

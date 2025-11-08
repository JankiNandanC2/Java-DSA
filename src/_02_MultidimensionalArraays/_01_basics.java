package _02_MultidimensionalArraays;

import java.util.Scanner;

public class _01_basics {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(arr[0][0]);// default zero
        arr[0][0]=5;  // declaration
        System.out.println(arr[0][0]);

        // length of array
        int m= arr.length;  //--> no of rows
        int n = arr[0].length ;// --> no of column
        System.out.println("no of rows of arr is : "+ m);
        System.out.println("No Of col : "+ n);

        // input
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array elements : ");
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ;j++){
                arr[i][j]=scan.nextInt();
            }
        }

//         output
        for(int i = 0 ; i<m  ; i++){
            for(int j = 0 ; j<n ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}

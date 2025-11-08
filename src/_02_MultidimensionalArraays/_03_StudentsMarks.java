package _02_MultidimensionalArraays;

import java.util.Scanner;

// side by side matrix
public class _03_StudentsMarks {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int m = arr.length; // no of row
        int n = arr[0].length; // no of col
        Scanner scan = new Scanner(System.in);
        System.out.println("enter roll no and marks : ");
        for(int i = 0 ; i<m ;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]= scan.nextInt();
            }
        }
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

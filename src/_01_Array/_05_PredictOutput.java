package _01_Array;
public class _05_PredictOutput {
    public static void main(String[] args) {
        int[] arr ;
        arr = new int[100];
        for (int i = 0; i <= arr.length  ; i++) {
            System.out.print(arr[i]+" ");
        }
//        System.out.println(arr[101]); // Index 101 out of bounds for length 100
    }
}

package _01_Array;

public class _06_PredictOutput {
    public static void main(String[] args) {
        int[] num = new int[26];
        num[0] = 100;
        num[25] = 200;
        System.out.println("\n" + num[0] + " " + num[25]);
        int temp = num[25];
        num[25] = num[0];
        num[0] = temp;
        System.out.println("\n" + num[0] + " " + num[25]);
    }
}

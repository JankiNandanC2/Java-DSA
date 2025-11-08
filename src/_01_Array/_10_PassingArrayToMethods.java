package _01_Array;

public class _10_PassingArrayToMethods {
    public static void main(String[] args) {
//        int x = 5 ;
//        System.out.println(x);
//        change(x);// pass by value here
//        System.out.println(x);

        // array k case m

        int[] arr ={10,20,30,40,50,60};
        int n = arr.length;

        for (int i = 0; i <= n-1  ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        change(arr);
        for (int i = 0; i <= n-1  ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }

    private static void change(int[] x) {
        x[0]=1111;
     }
}

package _08_Recursion;

public class _15_ArrayTraversal {
    public static void print(int i , int[] arr ){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    static void main(String[] args) {
        int[] arr = {4,7,2,3,8,6,9,3,8,6};
        /*
        // using loop
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // using for-each loop
        for(int ele : arr ){
            System.out.print(ele +" ");
        }
        System.out.println();

         */
        System.out.println("length of array is : "+arr.length);
        print(0,arr);
    }
}

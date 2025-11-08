package _01_Array;

import java.util.ArrayList;

public class  _13_ArrayList {
    public static void main(String[] args) {
//        int[] nums = new int[5]; // array without initialisation
//        for(int ele : nums){
//            System.out.print(ele +" ");
//        }
//        System.out.println();

        ArrayList<Integer> arr = new ArrayList<>(7);
        // insertion
        arr.add(0,12);
        arr.add(1,45);
        arr.add(2,33);
        arr.add(3,21);
        arr.add(4,88);
        arr.add(5,55);
        arr.add(6,95);
        arr.add(44); // automatically adds to last elements
        System.out.println(arr.size());
        arr.add(105);
        System.out.println(arr.size());

        int n = arr.size(); // gives size of arraylist

        // print arraylist method 1
        System.out.println(arr.get(1));

        for (int i = 0; i <= n-1 ; i++) {
        System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        // change / modify \list
        arr.set(2,555);
        arr.set(0,1);

        // print method 2
        System.out.println(arr);
    }
}

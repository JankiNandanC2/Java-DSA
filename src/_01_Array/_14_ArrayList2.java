package _01_Array;

import java.util.ArrayList;

public class _14_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        System.out.println(list+" "+list.size());

        list.add(44);
        System.out.println(list+" "+list.size());

        list.add(51);
        System.out.println(list+" "+list.size());

        list.add(91);
        System.out.println(list+" "+list.size());

        list.add(77);
        System.out.println(list+" "+list.size());

        list.add(23);
        System.out.println(list+" "+list.size());
// to remove a element from a specific index
        list.remove(1);
        System.out.println(list+" "+list.size());

        list.remove(1);
        System.out.println(list+" "+list.size());

        list.remove(1);
        System.out.println(list+" "+list.size());
// to check  a element is present
        boolean flag = list.contains(11);
        System.out.println(flag);
    }
}

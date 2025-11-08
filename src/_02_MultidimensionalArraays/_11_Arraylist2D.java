package _02_MultidimensionalArraays;

import java.util.*;
import java.util.List;

public class _11_Arraylist2D {
    public static void main(String[] args) {
//  1d list
        List<Integer> a = new ArrayList<>();
        a.add(50);a.add(60);a.add(70);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) +" ");
        }
        System.out.println();
        System.out.print(a);
        List<Integer> b = new ArrayList<>();
        b.add(30);b.add(40);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(100);
//  2d --  list of list
        // declartion
       List<List<Integer>> list = new ArrayList<>();
       list.add(a) ; list.add(b);list.add(c); list.add(d);

        System.out.println();
       // print all list of list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" " );
        }
        System.out.println();

        //specific element of a specfic list
        System.out.println(list.get(1).get(1));
        System.out.println(list.get(0).get(2));

        System.out.println();

//        another way to print
//        list.clear(); // to remove all elements of list
        for (int i = 0 ; i< list.size() ; i++){
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}

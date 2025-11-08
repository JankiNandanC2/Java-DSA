package _02_MultidimensionalArraays;
import com.sun.jdi.IntegerType;

import java.sql.SQLOutput;
import java.util.*;
public class _12_StlImplementationOnLIst {
    public static void print(List<List<Integer>> list ){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size() ; j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> a = new ArrayList<>(4);
        a.add(10); a.add(20) ;a.add(30) ;a.add(40);a.add(50);
        List<Integer> b = new ArrayList<>(3); //empty
        b.add(33);
        List<Integer> c = new ArrayList<>(7);
        c.add(40); c.add(50) ;c.add(60) ;c.add(70); c.add(80) ;

        // adding list to 2d list
        list.add(a);
        list.add(b);
        list.add(c);
        print(list);

        // remove element
        a.remove(4) ; a.remove(3);
        print(list);

//        // remove all element
//        list.clear();
//        print(list);
//        // adding list to 2d list
//        list.add(a);
//        print(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(b));
        System.out.println(list.indexOf(c));

        print(list);
    }
}

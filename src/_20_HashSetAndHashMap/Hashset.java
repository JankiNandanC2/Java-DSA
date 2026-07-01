package _20_HashSetAndHashMap;

import  java.util.HashSet ;

public class Hashset {
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;
        // it stores unique elements

        //to add element
        set.add(9);
        set.add(9);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(11);
        set.add(12);
        set.add(13);
        System.out.println(set);

        // search an element
        System.out.println(set.contains(12));
        System.out.println(set.contains(77));

        // size of set
        System.out.println("size of set is : "+set.size());

        // remove an element
        System.out.println(set);
        boolean b = set.remove(8); // not present in sett so returns false
        System.out.println(b);
        b = set.remove(9); //  present in set so returns true
        System.out.println(b);
        System.out.println(set);
        System.out.println("size of set is : "+set.size());


        // to convert a set to array
        Object[] arr = set.toArray();


        // to iterate in hashset -- hashset has no concept of index
        System.out.println("Iterating hashset Elements :- ");
        // during iteration using for each loop -- we cant remove or delete element
        for(int ele : set){
            System.out.println(ele);
        }

    }
}

package Extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionsClass {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original List: "+ list);
// to find the frequency of an element
        System.out.print("Frequency of 1 is : ");
        System.out.println(Collections.frequency(list, 1));
// to rotate a list
        Collections.rotate(list ,5); // '+' rotate left to rotate right use '-'
        System.out.println(list);
        Collections.rotate(list ,-5); // '+' rotate left to rotate right use '-'
        System.out.println(list);
// to copy new list into list
        ArrayList<Integer> list2 = new ArrayList<>(list.size());
        list2.add(100);
        System.out.println("New list is : "+ list2);
        Collections.copy(list, list2); // ( destination , source )
// to swap two elements
        Collections.swap(list,0,8);
        System.out.println(list);
// to shuffle
        Collections.shuffle(list);
        System.out.println(list);
// to find the reverse
        Collections.reverse(list);
        System.out.println(list);
// binary search in list
        int indx = Collections.binarySearch(list,55);
        System.out.println("Index is:  "+indx);
// to find min value in list
        int a = Collections.min(list);
        int b = Collections.max(list);
        System.out.println("min value in list is : "+ a +" and max value is :  "+ b);
// to sort the list
        System.out.println("Ascending Order ");
        // Collections.sort(list); // ascending order
        Collections.sort(list , Comparator.naturalOrder()); // ascending order
        System.out.println(list);
        System.out.println("Descending Order ");
        Collections.sort(list, Comparator.reverseOrder()); // descening order
        System.out.println(list);

/*
        // list to array
        Object[] arr = list.toArray();
        for(Object ele : arr) System.out.print(ele+" ");
        System.out.println();
 */
    }
}

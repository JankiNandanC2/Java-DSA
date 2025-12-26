package _03_Strings;

import java.util.Scanner;

public class _04_IndexOfAndCompareTo {
    public static void main(String[] args) {
       /* String str = "janki Nandan";
        // first index when it appears
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('z'));
        System.out.println(str.indexOf('n'));
        System.out.println();
        // last index of
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf('z'));
        System.out.println(str.lastIndexOf('n'));
        System.out.println();
        */

        // compare to - compare two strings lexicographically
       String a = "abc";
       String b = "aac";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println();

        a = "abcgggggg";
        b = "abc";  // no of times g appaers gere
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println();

        a = "abcgggg";
        b = "abc";  // no of times g appaers gere
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
    }
}

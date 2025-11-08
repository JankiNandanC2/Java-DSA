package _03_Strings;
import java.util.*;
public class _09_PrintAllSubStrings {
    public static void main(String[] args) {
        // print all substrings of a string
        String s = "abcde";
//        for (int i = 0; i <s.length() ; i++) {
//            String a ="";
//            for (int j = i; j <s.length() ; j++) {
//                String c = String.valueOf(s.charAt(j));
//                a=a.concat(c);
//                System.out.println(a);
//            }
//        }
        // method 2
        // for all a substring
    /*    for (int i = 1; i <= s.length(); i++) {
            System.out.println(s.substring(0,i));
        }
    */
//        System.out.println(s.substring(1));
//        System.out.println();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring( i, j));
            }
        }
    }
}

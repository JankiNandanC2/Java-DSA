package _08_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

// did  it myself --- by luck first try me ban gya  ..

public class _18_SubsetsOfString {
    static ArrayList<String> arr = new ArrayList<>();
    public static void subsets(int i , String s ,String ans ){
        if(i==s.length()){
//            System.out.println(ans);
            arr.add(ans);
            return;
        }
        subsets(i+1,s ,ans + s.charAt(i) ); // take the char
        subsets(i+1,s,ans); // not take the char
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter String :");
        String s = scan.next();
        System.out.println("length of string is : "+s.length());
        System.out.println("subsets of string are : ");
        arr = new ArrayList<>(); // jab global list banya to mulltile testcase me sometimes issue ata h leetcode... ye sb pr so obje bna do again se ....
        subsets(0, s ,"");
        System.out.println(arr);
    }
}

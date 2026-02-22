package _08_Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class _22_BinaryStringWithoutConsecutives1 {
    // ny myself
    public static void binaryString(int n , String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return ;
        }
        binaryString(n,ans+0);
        if(! ans.endsWith("1")) binaryString(n,ans+1);
        /*
        if(ans.length()==0) binaryString(n,ans+1);
        else if( ans.charAt(ans.length()-1) != '1') binaryString(n,ans+1);
         */
    }

    // below one by sir ----
    public static void printString(String s , int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1) == '0') {
            printString(s+1, n);
            printString(s+0,n);
        }
        else printString(s+0, n);
    }

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scan.nextInt();
        binaryString(n,"");
        System.out.println();
        System.out.println();
        printString("",n);
    }
}

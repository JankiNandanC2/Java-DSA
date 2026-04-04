package _08_Recursion;

import java.util.Scanner;
// ques - print all increasing sequences of length k from first n natural numbers
public class _20_HwPrintAllIncreasingSequences {
    /* wrong code
    public static void sequence(int i ,int k , int n , String ans , int count ){
        if(count==k) {
            System.out.print(ans+" ");
        }
        if(i>n) return;
        sequence(i+1 , k , n , ans + i, count+1 ); // take the value
        sequence(i+1 ,k , n ,ans,count);  //  Not take the value
    }
     */
    public static void printSubsequence(int n , int k , int i , String ans ){
        if(ans.length() == k ) {
            System.out.println(ans);
            return;
        }
        if(i > n ) return;
        // take the string int
        printSubsequence(n, k , i+1 , ans+i);
        // not take the string case
        printSubsequence(n,k , i+1, ans);
    }
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scan.nextInt();
        System.out.print("Enter value of length (k) : ");
        int k = scan.nextInt();
        String ans = "";
        printSubsequence(n, k , 1 ,"");
//        sequence(1,k,n,ans, 0); ---> wrong
    }
}

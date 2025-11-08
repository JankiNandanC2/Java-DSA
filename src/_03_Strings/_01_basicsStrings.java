package _03_Strings;
import java.util.*;
import java.util.Scanner;
public class _01_basicsStrings {
    public static void main(String[] args) {
        char[] arr={'j','a','n','k','i','N','a','n','d','a','n'};
// output
        /*
        for(char ele : arr ){
            System.out.print(ele+" ") ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ") ;
        }
        System.out.println();
        */

        String x  = "JankiNandan";
        System.out.println(x);
        x = "Janki Nandan is a btech student";
        System.out.println(x);
// input
        /*
       Scanner scan = new Scanner(System.in);

       System.out.println("Enter your Name : ");
       String str = scan.next();
       System.out.println("hi "+ str);

       // Dummy nextLine to consume leftover newline
        scan.nextLine();

       System.out.println("Enter your Full Name : ");
       String str1 = scan.nextLine();
       System.out.println("hi "+ str1);
       */
    }
}

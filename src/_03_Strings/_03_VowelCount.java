package _03_Strings;

import java.util.Scanner;

public class _03_VowelCount {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a string :  ");
        String str =scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            /*if(str.charAt(i)=='a') count++;
            else if(str.charAt(i)=='e') count++;
            else if(str.charAt(i)=='i') count++;
            else if(str.charAt(i)=='o') count++;
            else if(str.charAt(i)=='u') count++;*/
            char ch = str.charAt(i);
            if(isvowel(ch) == true) {
                count++;
            }
        }
        System.out.println("no of vowel is : " +count);
    }
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='A') return true;
        else if(ch=='e' || ch=='E') return true;
        else if(ch=='i' || ch=='I') return true;
        else if(ch=='o' || ch=='O') return true;
        else if(ch=='u' || ch=='U') return true;
        else return false ;
    }
}

package _04_StringBuilder;

import java.util.Scanner;

public class _11_ReverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println(sb);
        int i = 0 , j = 0 ;
        while(j < sb.length()) {
            if(sb.charAt(j) != ' ') j++;
            else {
                reverse(sb,i,j-1);
                i = j+1;
                j = i ;
            }
        }
        reverse(sb,i,j-1);  // last word reverse
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb , int i , int j ){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }

}

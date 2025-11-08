package _04_StringBuilder;

//  by myself
// called as frequencyArray

import java.util.Scanner;

public class _14_MaximumOcuurenceOfCharacter {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.next();
        int[] arr = new int[26];

        // increment array value
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i) ;
            int n = (int) ch ;
            arr[n-97]=arr[n-97]+1;
        }

        // maximum value find in array and store the index
        int mx = arr[0];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(mx<=arr[i]){
                mx=arr[i];
                index = i;
            }
        }
        char maxOccurCHar = (char) (index+97) ;
        System.out.println("maximum occured char is : "+maxOccurCHar+"\nand no of time it occured is : "+arr[index]);
    }
}
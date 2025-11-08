package _04_StringBuilder;

// by sir --> better code for more than one elements having max frequency
import java.util.Scanner;

public class _15_frequencyArray {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] freq = new int[26];

        // increment array value
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = (int) ch - 97;
            freq[n] = freq[n] + 1;
        }

        // maximum element
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            mx = Math.max(mx,freq[i]);
        }

        //finding element and print
        for (int i = 0; i < freq.length; i++) {
            if(mx==freq[i]){
                char ch =(char) (i+97);
                System.out.println(ch);
            }
        }
    }
}
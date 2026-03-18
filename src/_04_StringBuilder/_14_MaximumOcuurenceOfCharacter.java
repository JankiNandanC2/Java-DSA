package _04_StringBuilder;

//  by myself
// called as frequencyArray

import java.util.HashMap;
import java.util.Scanner;

public class _14_MaximumOcuurenceOfCharacter {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.next();
/*
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

 */

        HashMap<Character, Integer> map = new HashMap<>();
        // build frequency map
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // find maximum frequency
        int mx = Integer.MIN_VALUE;
        for (int value : map.values()) {
            mx = Math.max(mx, value);
        }

        // print characters with maximum frequency
        for (char key : map.keySet()) {
            if (map.get(key) == mx) {
                System.out.println(key+" repeated times : "+map.get(key));
            }
        }
    }
}
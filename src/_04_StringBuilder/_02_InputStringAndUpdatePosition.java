package _04_StringBuilder;

import java.util.Scanner;

public class _02_InputStringAndUpdatePosition{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str =scan.nextLine();
        System.out.println(str);

        String t =""; // empty string
        System.out.println(t);
        for(int i =0 ; i < str.length();i++){
            if(i%2==0)
                t +='a';
            else
                t += str.charAt(i);
//                t += str.substring(i,i+1);
        }
        System.out.println(t);
        str=t ;
        System.out.println(str);
    }
}

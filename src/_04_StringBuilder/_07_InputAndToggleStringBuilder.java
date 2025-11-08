package _04_StringBuilder;

import java.util.Scanner;

public class _07_InputAndToggleStringBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println(sb);

        for(int i = 0 ; i< sb.length(); i++) {
            int ascii = (int) sb.charAt(i);
// capital alphabet ascii value 65 to 97
            if (ascii >= 65 && ascii <= 90) {
                 ascii += 32;
            }
// small alphabet 97 to 122
            else if (ascii >= 97 && ascii <= 122) {
                 ascii -= 32;
            }
            sb.setCharAt(i,(char)ascii);
        }
        System.out.println(sb);
    }
}

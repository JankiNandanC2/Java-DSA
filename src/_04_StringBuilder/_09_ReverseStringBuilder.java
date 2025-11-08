package _04_StringBuilder;
import com.sun.jdi.event.StepEvent;

import java.util.Scanner;
// hw take stringBuilder and reverse without built in function
public class _09_ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        int i = 0 , j = sb.length()-1 ;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);

        //using built in function
        StringBuilder s = new StringBuilder("Jankinandan");
        s.reverse();
        System.out.println(s);
    }
}

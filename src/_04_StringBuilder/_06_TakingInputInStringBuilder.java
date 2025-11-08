package _04_StringBuilder;

import java.util.Scanner;

public class _06_TakingInputInStringBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.println(sb);

        // setCharAt() function
        StringBuilder sbb = new StringBuilder("JankiNandan");
        System.out.println(sbb);
        sbb.setCharAt(0,'M');  // format to update / replace char in string
        System.out.println(sbb);
    }
}

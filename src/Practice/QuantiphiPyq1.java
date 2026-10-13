package Practice;

import java.util.Scanner;

public class QuantiphiPyq1 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int MOD = 1_000_000_007;
//        double r1 = scan.nextInt();
//        double r2 = scan.nextInt();

        // testing
        double r1 = 89935934.4539485793;
        double r2 = 995347.8987423479;

        double PI = Math.PI; // forget during the OA

        // JUST PRECISELY PRINT UPTO X DIGIT OF A VALUE
        System.out.printf("%.2f\n", r1);
        System.out.printf("%.4f\n", r2);

        // or option 2
        System.out.println();
        String result = String.format("%.2f", r1);
        String result2 = String.format("%.4f", r2);
        System.out.println(result + "\n" + result2);

    }
}

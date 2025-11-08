package Practice;

import java.util.Scanner;

public class _2_stairCase {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("no of ways to climb the stairs is : "+steps(n));
    }
    public static int steps(int n) {
        int first = 1, second = 1, sum = 0;
        if (n < 2)
            return n;
        for (int i = 2; i <= n ; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}


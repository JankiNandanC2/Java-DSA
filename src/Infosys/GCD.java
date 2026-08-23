package Infosys;

public class GCD {
    static void main(String[] args) {
        System.out.println(gcd(7,3));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

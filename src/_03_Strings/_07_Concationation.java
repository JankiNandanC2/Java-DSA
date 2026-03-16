package _03_Strings;

public class _07_Concationation {
    public static void main(String[] args) {
        String a = "xyz";
        String b = "abcd";
        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a);
        a=a.concat(b);
        System.out.println(a);

        System.out.println();
        System.out.println(b);
        System.out.println(b+a);
        b = b.concat(a);
        System.out.println(b);

        // to conacat a char to String
        char c = 'j';
        b = b.concat(String.valueOf(c));
        System.out.println(b);
        // method 2
        char ch = 'X' ;
        b += ch ;
        System.out.println(b);
    }
}
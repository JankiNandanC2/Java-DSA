package _04_StringBuilder;

public class _01_StringImmutability {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        // Strings are immutable ...

        // to change the char at 2 index--> "hello" to "heylo"  lots oof memory waste
        s = s.substring(0,2)+'y'+s.substring(3,s.length());  // costly in sense of memory
        System.out.println(s);

        // immutability in java due to security reasons
    }
}

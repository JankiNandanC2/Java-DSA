package _04_StringBuilder;

// String is passed by value in function not by reference

public class _15_passingStringsToFunction {
    static void main() {
        String s ="janki nandan";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s) {
        s = "rana sittu";
    }

}

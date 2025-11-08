package _03_Strings;

public class _02_BuiltInStringMethod {
    public static void main(String[] args) {
        String str = "Janki Nandan";
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println("length of string is : "+str.length());
        //  System.out.println(str.charAt(13));
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 13 out of bounds for length 12
    }
}

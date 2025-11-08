package _03_Strings;

public class _08_SubStrings {
    public static void main(String[] args) {
        // empty String
        System.out.println();
        String s = "";
        System.out.println("length of empty string is : "+s.length());
        String str = "abcde";
        System.out.println(str.substring(0));
        System.out.println(str.substring(1));
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3,3)); // print nothing
        System.out.println(str.substring(4));
    }
}

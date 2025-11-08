package _03_Strings;

public class _06_LowerAndUpperCase {
    public static void main(String[] args) {
        String str = "JANKI NANDAN is 20 yrs old ";
        //TO LOWERCASE
        str.toLowerCase(); // no change if used like this
        System.out.println(str);
        System.out.println(str.toLowerCase());
        String a = str.toLowerCase();
        System.out.println(a);
        System.out.println("before change :  "+str);
        str = str.toLowerCase();
        System.out.println("after change :  "+str);
        System.out.println();
        System.out.println();
        // uppercase
        str.toUpperCase(); // no change if used like this
        System.out.println(str);
        System.out.println(str.toUpperCase());
        String b = str.toUpperCase();
        System.out.println(b);
        System.out.println("before change :  "+str);
        str = str.toUpperCase();
        System.out.println("after change :  "+str);
    }
}

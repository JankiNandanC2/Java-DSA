package _03_Strings;

public class _08_SubStrings {
    public static void main(String[] args) {
        // empty String
        System.out.println();
        String s = "";
        System.out.println("length of empty string is : "+s.length());
        String str = "abcde";
        System.out.println("Length of string is : "+str.length());
        System.out.println(str.substring(0));
        System.out.println(str.substring(1));
        // substring range wale case (0 , n) m ye --  0 to (n-1)th element tak print karta h
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(3,3));
        // print nothing bcz 3 se start kr 3-1 tk jayega yani ki (3,2) so ... thats why blanck space prnt hoga
        System.out.println(str.substring(4));
    }
}

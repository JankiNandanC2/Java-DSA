package _03_Strings;

public class _10_plusOperator {
    public static void main(String[] args) {
       /* String str = "abc11";
        System.out.println(str);
        str = str.concat("xyz11");
        System.out.println(str); */

        String str = "abc";
        System.out.println(str);
        str += "pqr" ;
        System.out.println(str);

        String str2 = "xyz";
        str = str + str2;
        System.out.println(str);
        System.out.println(str2);
        str = 10 + str ; // integer +string
        System.out.println(str);  // 10abcpqrxyz
        System.out.println("j"+99+str); // j9910abcpqrxyz
        str = 'j' + 99 + str ;// 20510abcpqrxyz // char + integer -> int + string
        System.out.println(str);
// string
        System.out.println("hi i am "+10 +" years old ");
// dry run
        System.out.println("abc"+10+20);
        // associativity left to right
        // int + int = int
        // string + int = string
        //  int + string = string
        // char + int = int
        System.out.println(10+20+"abc");


    }
}

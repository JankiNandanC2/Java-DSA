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
        System.out.println(str);
        str = 'j' + 99 + str ;
        System.out.println(str);// string  +  integer + string
// string
        System.out.println("hi i am "+10 +" years old ");
// dry run
        System.out.println("abc"+10+20);
// associativity left to right
 // int + int = int
// string + int = string //  int + string = string
        System.out.println(10+20+"abc");


    }
}

package _04_StringBuilder;
// int terms of string we use equals() method
public class _03_Equals {
    public static void main(String[] args) {
        /*int a =0 , b = 1 ;
        System.out.println(a==b);
        System.out.println(a=b); */
// interning concept
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s); // new string formed
        String c ="abc";
        c = c+"xyz";

// ==  in case of string it compares their addresses
        System.out.println(s==a); // true
        System.out.println(s==b); //false
        System.out.println(s==c); //false
        System.out.println(a==b);  //false
        System.out.println(a==c);  //false
        System.out.println(b==c);  //false
        System.out.println();

// s.equal() -- it compares the string
        System.out.println(s.equals(c)); // true
        System.out.println(s.equals(b)); // true
        System.out.println(s.equals(c)); // true
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true
        System.out.println(b.equals(c)); // true
        System.out.println();
// .compareTo()  -- 0 means true , 1 Means false
        System.out.println(s.compareTo(c)); // true
        System.out.println(s.compareTo(b)); // true
        System.out.println(s.compareTo(c)); // true
        System.out.println(a.compareTo(b)); // true
        System.out.println(a.compareTo(c)); // true
        System.out.println(b.compareTo(c)); // true
    }
}

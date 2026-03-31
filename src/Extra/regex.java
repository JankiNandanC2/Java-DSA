package Extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    static void main(String[] args) {
        // rather than using the following 3 line of below we could directly use .matches() method to check
        String a = "aaaabbbb";
        boolean c = a.matches("a*b+");
        System.out.println("easy match method : "+ c); // true

        a = "a*b+";
        c = a.matches("aaaaaabbb");
        System.out.println("easy match method : "+ c); // false

        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ab");
        boolean b = m.matches();
        System.out.println("matched case1 : "+ b);// true

        p = Pattern.compile("a*b");
        m = p.matcher("aaaaabb");
        b = m.matches();
        System.out.println("matched case2 : "+ b); // true

        p = Pattern.compile("a*b");
        m = p.matcher("aaaaa");
        b = m.matches();
        System.out.println("matched case3 : "+ b); // false

        p = Pattern.compile("a*b");
        m = p.matcher("baaaaa");
        b = m.matches();
        System.out.println("matched case4 : "+ b); // false

        p = Pattern.compile("a*b");
        m = p.matcher("b");
        b = m.matches();
        System.out.println("matched case5 : "+ b);  // true

        p = Pattern.compile("a*b");
        m = p.matcher("bb");
        b = m.matches();
        System.out.println("matched case6 : "+ b); // false

        p = Pattern.compile("a*b+");
        m = p.matcher("bb");
        b = m.matches();
        System.out.println("matched case7 : "+ b); // true

        p = Pattern.compile("a*b+");
        m = p.matcher("aaaaaa");
        b = m.matches();
        System.out.println("matched case8 : "+ b); // false

        p = Pattern.compile("a*b+");
        m = p.matcher("aaaaaabbbbbbbb");
        b = m.matches();
        System.out.println("matched case9 : "+ b); // true

        p = Pattern.compile("a{5}b{4}"); // eaxctly wal case
        m = p.matcher("aaaaabbbb");
        b = m.matches();
        System.out.println("matched caseB1 : "+ b); // true

        p = Pattern.compile("a{5}b{4}"); // eaxctly wal case
        m = p.matcher("aaabb");
        b = m.matches();
        System.out.println("matched caseB2 : "+ b); // false

        p = Pattern.compile("a{5,}b{4,}"); // atleast given no of times
        m = p.matcher("aaaaaaaaaaaabbbbbbbbbb");
        b = m.matches();
        System.out.println("matched caseB3 : "+ b); // true

        p = Pattern.compile("a{5,88}b{0,2}"); // in range
        m = p.matcher("aaaaaaa");
        b = m.matches();
        System.out.println("matched caseB4 : "+ b); // true
    }
}

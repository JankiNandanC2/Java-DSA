package Practice;

import java.util.HashMap;

public class insertStringInStringArray implements Comparable {
    static void main() {
        String s = "       dasldkj   kjfjsdjfjs  jadndfsdlfksdl sk      lkflsf" +
                "   " +
                "l      sdfjlf kjnfjsdf nlfls " +
                "  ncsdlfs               j    ";
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(s.strip());
        s = s.replaceAll("\\s+" , " ");
        System.out.println(s);

        String[] arr = s.split(" " );
        for( String str : arr){
            System.out.println(str);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}

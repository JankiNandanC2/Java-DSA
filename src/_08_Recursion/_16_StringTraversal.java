package _08_Recursion;

public class _16_StringTraversal {
    public static void print(int i , String s ){
        if(i==s.length()) return;
        System.out.print(s.charAt(i));
        print(i+1,s);
    }
    static void main(String[] args) {
        String s = "Janki Nandan";
        System.out.println(s);
        print(0,s);
    }
}

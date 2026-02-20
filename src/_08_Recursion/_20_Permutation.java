package _08_Recursion;

public class _20_Permutation {
    public static void printPermutation(String s , String ans ){
        if(s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutation(left+right , ans+ch);
        }
    }
    static void main(String[] args) {
        String s = "abcd" ;
        printPermutation(s, "");
    }
}

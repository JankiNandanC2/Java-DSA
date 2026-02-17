package _08_Recursion;

public class _17_SkipACharacter {
    public static void skip(int i , String s , String ans){
        if(i == s.length()) {
            System.out.println(ans);
            return ;
        }
        if(s.charAt(i) == 'a') skip(i+1 ,s ,ans);
        else skip(i+1 ,s ,ans+s.charAt(i));
//        if((s.charAt(i) != 'a')  &&  (s.charAt(i) != 'A')) {
//            ans = ans + s.charAt(i);
//            /*
//            char ch = s.charAt(i);
//            ans.concat(String.valueOf(ch));
//             */
//        }
//        skip(i+1 ,s ,ans);
    }
    static void main(String[] args) {
        String s = "Raghav garg";
        System.out.println(s);
        skip(0,s,"");
    }
}

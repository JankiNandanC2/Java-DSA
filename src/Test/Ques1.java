package Test;
public class Ques1 {
    static void main(String[] args) {
        String str = "aaabbcccc";
        String ans = compressedString(str);
        System.out.println(ans);
    }
    public static String compressedString(String str) {
        int  n = str.length();
        String ans = str ;
        for(int i  = 0  ; i<= n-2 ;i++){
            int count = 0 ;
            char curr = str.charAt(i);
            char next = str.charAt(i+1);

            if(curr == next){
                count++ ;
            }
            else {
                ans = "sj" ;
            }
        }
        return ans ;
    }

}

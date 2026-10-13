package Infosys;

import java.util.Scanner;

public class _7_FindBase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ans = 0 ; int base = 2 ;

        while(true ) {
            int num = m ;
            int prev =  num % base ;
            num /= base ; boolean valid = true ;

            while (num > 0 ){
                int bit =  num % base ;
                num /= base ;

                if( bit != prev){
                    valid = false ;
                    break ;
                }
            }
            if( valid ){
                ans = base ;
                break;
            }
            base++ ;
        }
        System.out.println("base is : "+ ans);
//        System.out.println(Integer.compare(m , base));
        long number = BaseToNumber(m+"" , base);
        System.out.println("number is : "+number);
    }
    public static Long BaseToNumber(String num , int base ){
        long number = 0 ;
        long MOD = (long) 1e8;
        for(int i = 0 ; i < num.length() ; i++){
            number = (number * base + num.charAt(i)-'0') % MOD ;
        }
        return number ;
    }
}

package _12_LinkedListPart2;

public class hw5Leetcode202HappyNumber {
    /*
    class Solution {
    public int sumOfSquareOfDigit(int n){
        int square = 0 ;
        while(n > 0 ){
            int ld = n % 10 ;
            square = square + (ld*ld) ;
            n = n/10 ;
        }
        return square ;
    }
    public boolean happy(int slow , int fast ){
        slow = sumOfSquareOfDigit(slow);
        fast = sumOfSquareOfDigit(sumOfSquareOfDigit(fast));
        if(fast == 1 || slow == 1) return true ; // happy no condition satisfied
        else if(slow == fast ) return false ; // mtlv cycle mil gya
        return happy(slow , fast);
    }
    public boolean isHappy(int n) {
        int slow =  n ;
        int fast =  n ;
        if( fast == 1 || slow == 1) return true ;
        return happy( slow , fast );
    }
}
 */


    /*
    // using hashset
    class Solution {
    public boolean happy(HashSet<Integer> set , int n){
        int square = 0 ;
        while(n > 0 ){
            int ld = n % 10 ;
            square = square + (ld*ld) ;
            n = n/10 ;
        }
        if( square  == 1 ) return true;
        if(set.contains(square)) return false;
        else set.add(square);
        return happy(set , square);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return happy(set , n) ;
    }
}
     */
}
class Solution {
    public int sumOfSquareOfDigit(int n){
        int square = 0 ;
        while(n > 0 ){
            int ld = n % 10 ;
            square = square + (ld*ld) ;
            n = n/10 ;
        }
        return square ;
    }
    public boolean happy(int slow , int fast ){
        slow = sumOfSquareOfDigit(slow);
        fast = sumOfSquareOfDigit(sumOfSquareOfDigit(fast));
        if(fast == 1 || slow == 1) return true ; // happy no condition satisfied
        else if(slow == fast ) return false ; // mtlv cycle mil gya
        return happy(slow , fast);
    }
    public boolean isHappy(int n) {
        int slow =  n ;
        int fast =  n ;
        if( fast == 1 || slow == 1) return true ;
        return happy( slow , fast );
    }
}

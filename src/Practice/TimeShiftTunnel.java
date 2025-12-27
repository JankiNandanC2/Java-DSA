/*
 wrong appraoch
package Practice;

import java.util.Scanner;

public class TimeShiftTunnel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // no of process to be inputed
        int n = scan.nextInt();
        scan.nextLine();
        //String array to sre the inputs
        String[] str = new String[n];
        //input
        for (int i = 0; i < n; i++) {
            str[i]=scan.nextLine();
        }
        //start looking for priority
        for (int i = 0; i < n; i++) {
            if(str[i].charAt((str[i].length()-1)) == '3')
                printArrivalId(str[i]);
        }
        for (int i = 0; i < n; i++) {
            if(str[i].charAt((str[i].length()-1)) == '2')
                printArrivalId(str[i]);
        }for (int i = 0; i < n; i++) {
            if(str[i].charAt((str[i].length()-1)) == '1')
                printArrivalId(str[i]);
        }
    }
    public static void printArrivalId(String s){
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) != ' ') i++ ;
            else {
                System.out.print(s.charAt(i));
                System.out.print(s.charAt(i+1));
                System.out.print(s.charAt(i+2));
                break;
            }
        }
    }

}

*/

package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class TimeShiftTunnel{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        // 3 list bana lo
        List<String> gold = new ArrayList<>();
        List<String> silver = new ArrayList<>();
        List<String> regular = new ArrayList<>();
        // loop n times
        for(int i = 0 ; i<n ; i++){
            String s = scan.nextLine();
            if(s.charAt(0)=='A'){
                // ye split string ko parts m kr deta on a given condtion here ' ' .
                String[] parts = s.split(" ");
                String id = parts[1];
                String type = parts[2];
                /*
                if(s.charAt(s.length()-1)=='3') gold.add(id);
                else if(s.charAt(s.length()-1)=='2') silver.add(id);
                else if(s.charAt(s.length()-1)=='1') regular.add(id
                 */
                if(type.equals("3")) gold.add(id);
                else if(type.equals("2")) silver.add(id);
                else if(type.equals("1")) regular.add(id) ;
            }
            else{
                if(!gold.isEmpty())
                    System.out.println(gold.remove(0));
                else if(!silver.isEmpty())
                    System.out.println(silver.remove(0));
                else if(!regular.isEmpty())
                    System.out.println(regular.remove(0));
            }
        }
    }
}







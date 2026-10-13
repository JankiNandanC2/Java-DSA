package EpamScenarioBased;

import java.util.*;
import java.time.LocalDate;

public class epampyq1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if( n == 0 ) {
            System.out.println("NO LOGINS");
            return;
        }
        String[][] arr = new String[n][2];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = scan.next(); // input name
            arr[i][1] = scan.next(); // input localDate in string format
        }

        HashMap<String , TreeSet<Long>> map = new HashMap<>(); // store name and its date in epoch form
        for(int i = 0 ; i < n ; i++){
            String name = arr[i][0];
            long date = LocalDate.parse(arr[i][1]).toEpochDay();
            map.putIfAbsent(name , new TreeSet<>());
            map.get(name).add(date);
        }

        // now traverse every name and maintain a max freq to store the maximum streak
        TreeMap<String,Integer> freq = new TreeMap<>();
        int maxStreak = 0 ;
        for( String name : map.keySet()){
            TreeSet<Long> set = map.get(name);
            //traverse the set and count the max continuous streak
            int currMaxStreak = 0;
            int count = 0; long prev = -1 ;
            for(long ele : set ){
                if( prev != -1 && ele == prev + 1){
                    count++ ;
                }else {
                    count = 1 ;
                }
                prev = ele ;
                currMaxStreak = Math.max(currMaxStreak, count);
            }
            freq.put(name , currMaxStreak );
            maxStreak = Math.max(maxStreak , currMaxStreak);
        }

        StringBuilder ans  = new StringBuilder();
        for(String name : freq.keySet()){
            if(freq.get(name) == maxStreak ){
                ans.append(name).append(" ");
                ans.append(maxStreak);
                ans.append("\n");
            }
        }

        System.out.println(ans);
    }
}

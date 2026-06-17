package EpamScenarioBased;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

// mine version -- coded by me ---> improved further by ai

public class ParkingLotMonthlySubscription {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // enter the entry logs
        HashMap<String , Integer> entryData = new HashMap<>();
        System.out.print("Enter the No of entry logs : ");
        int e = scan.nextInt();
        scan.nextLine() ; // to consume the buffer newLine

        for(int i = 0 ; i < e ; i++){
            String s = scan.nextLine();
            String[] details = s.trim().split("\\s+");
            String vehicleNo = details[0];
            entryData.put(vehicleNo, entryData.getOrDefault( vehicleNo , 0)+1);
        }

        // check the limit of every vehile no
        HashMap<String,Integer> exceedData = new HashMap<>();
        System.out.println("Enter the  no of subscription details  : ");
        int s = scan.nextInt();
        scan.nextLine() ; // to consume the buffer newLine

        for(int i = 0 ; i < s ; i++){
            String data = scan.nextLine();
            String[] details = data.trim().split("\\s+"); // details[0] = vehicle no && details[1] = limit
            String vehicleNo = details[0];
            int allowedEntry = Integer.parseInt(details[1]); // limit of a vehicle

            int currentEntry = entryData.getOrDefault(vehicleNo , 0) ; // entry in logs stored in entry data
            if(currentEntry > allowedEntry ) exceedData.put( vehicleNo , currentEntry - allowedEntry );
        }
        
        // now arrange the vehicle in descending order of exceeding limit and display it
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>((a, b) ->{
            if(b.getValue().equals(a.getValue())) return a.getKey().compareTo(b.getKey()) ;
            return Integer.compare(b.getValue() , a.getValue());
        });

        maxHeap.addAll(exceedData.entrySet());

        // now time to display in descending order
        while( ! maxHeap.isEmpty()){
            Map.Entry<String, Integer> entry = maxHeap.poll();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

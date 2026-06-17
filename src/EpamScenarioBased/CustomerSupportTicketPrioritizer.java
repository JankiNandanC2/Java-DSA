package EpamScenarioBased;
import java.util.* ;

public class CustomerSupportTicketPrioritizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String , Integer> map = new HashMap<>();
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
            String customerId = scan.next();
            int severityScore = scan.nextInt();
            map.put(customerId , Math.max( severityScore , map.getOrDefault(customerId , 0 )));
        }

        PriorityQueue<Map.Entry<String , Integer>> maxHeap = new PriorityQueue<>( (a,b) -> {
            if( a.getValue().equals(b.getValue())) return b.getKey().compareTo(a.getKey());
            return Integer.compare(b.getValue() , a.getValue()) ;
        });

        maxHeap.addAll( map.entrySet()) ;

        while(! maxHeap.isEmpty()){
            Map.Entry<String , Integer> entry = maxHeap.poll();
            System.out.println(entry.getKey());
        }

    }
}

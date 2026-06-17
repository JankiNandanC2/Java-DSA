package EpamScenarioBased;

import java.util.*;

public class ParkingLotMonthlySubscriptionChatGpt {

    static class Node {
        String vehicleNumber;
        int timestamp;
        Node next;

        Node(String vehicleNumber, int timestamp) {
            this.vehicleNumber = vehicleNumber;
            this.timestamp = timestamp;
        }
    }

    static Node head = null;
    static Node tail = null;

    static void addEntry(String vehicleNumber, int timestamp) {
        Node newNode = new Node(vehicleNumber, timestamp);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();

        // Build linked list
        for (int i = 0; i < E; i++) {
            String vehicleNumber = sc.next();
            int timestamp = sc.nextInt();

            addEntry(vehicleNumber, timestamp);
        }

        // Count entries from linked list
        HashMap<String, Integer> entryCount = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            entryCount.put(
                    curr.vehicleNumber,
                    entryCount.getOrDefault(curr.vehicleNumber, 0) + 1
            );

            curr = curr.next;
        }

        int S = sc.nextInt();

        HashMap<String, Integer> exceeded = new HashMap<>();

        // Process subscribed vehicles
        for (int i = 0; i < S; i++) {

            String vehicleNumber = sc.next();
            int allowedEntries = sc.nextInt();

            int actualEntries =
                    entryCount.getOrDefault(vehicleNumber, 0);

            if (actualEntries > allowedEntries) {
                exceeded.put(
                        vehicleNumber,
                        actualEntries - allowedEntries
                );
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> {
                            if (!a.getValue().equals(b.getValue())) {
                                return b.getValue() - a.getValue();
                            }
                            return a.getKey().compareTo(b.getKey());
                        }
                );

        pq.addAll(exceeded.entrySet());

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();

            System.out.println(
                    entry.getKey() + " " + entry.getValue()
            );
        }
    }
}
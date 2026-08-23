package Extra;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        // Arraylist , hashMap , HashSet  --- > done
        System.out.println("\nAB padhenge LinkedList ");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(90);
        linkedList.add(80);
        linkedList.add(70);
        linkedList.add(60);
        linkedList.add(50);
        linkedList.add(40);
        linkedList.add(30);
        System.out.println(linkedList);
        linkedList.remove(2) ;
        System.out.println(linkedList);

        // VECTORS  -- thread safe
        System.out.println("\nAB padhenge Vector ");
        Vector<String> vector = new Vector<>();
        vector.add("8");
        vector.add("10");
        vector.add("15");
        vector.add("JankiNandan");
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);

        //Stack -- > thread safe , synchronised
        System.out.println("\nAB padhenge Stack ");
        Stack<Integer> st = new Stack<>() ;
        st.push(90);
        st.push(80);
        st.push(70);
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);

        // hashSet -- > no order maintain , only unique value stores
        System.out.println("\nAB padhenge HashSet ");
        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(20);
        set.add(10);
        set.add(1);
        set.add(11);
        set.add(12);
        set.add(12);
        System.out.println(set);

        // LinkedHashSet --> order maintained , only unique value
        System.out.println("\nAB padhenge LinkedHashSet ");
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        lset.add(9);
        lset.add(20);
        lset.add(10);
        lset.add(1);
        lset.add(11);
        lset.add(12);
        lset.add(12);
        boolean pre = lset.contains(1);
        System.out.println(pre);
        System.out.println(lset);

        // Tree Set -- sorted and unique
        System.out.println("\nAB padhenge TreeSet ");
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(9);
        tset.add(20);
        tset.add(10);
        tset.add(1);
        tset.add(11);
        tset.add(12);
        tset.add(12);
        System.out.println(tset.first());
        System.out.println(tset.last());
        System.out.println(tset);
        System.out.println(tset.pollLast());
        System.out.println(tset.pollFirst());
        System.out.println(tset);


        System.out.println("\nAB padhenge Queue ");
        // Queue --> maintains the priority of elements
//        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.offer(20); // to add element at rear end of queue
        queue.offer(30);
        queue.offer(40);
        queue.add(50); // add and offer both add elements at rear end
        System.out.println("queue : "+queue);
        System.out.println("queue remove() :"+queue.remove());
        System.out.println("queue : "+queue);
        System.out.println("queue peek() : "+queue.peek());
        System.out.println("queue poll() : "+queue.poll()); // both poll and remove removes the first element
        System.out.println("queue : "+queue);

        // array Dequeuw
        System.out.println("\nAB padhenge ArrayDeque ");
        Deque<Integer> adq = new ArrayDeque<>();
//        adq.offerFirst(10);
//        adq.offerFirst(20);
//        adq.offerLast(30);
//        adq.offerLast(40);
//        adq.offerLast(50);
//        adq.offerLast(60);
//        System.out.println(adq);
//        System.out.println("poll first : "+adq.pollFirst()); // poll and poll first are same kam
//        System.out.println("poll  : "+adq.pollFirst());
//        System.out.println("poll Last : "+adq.pollLast());
//        System.out.println(adq);



        System.out.println(adq.poll());


        // Priority Queue --- it always maintains the min value on top
        System.out.println("\nAB padhenge PRIORITY queue ");
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // uses min heap by deafult
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        pq.offer(10);
        pq.offer(3);
        pq.offer(1);
        pq.offer(20);
        System.out.println("priority queue : "+pq);
        System.out.println("priority queue peek : "+pq.peek());
        pq.remove(10);
        System.out.println(pq);

        // HashMap
        System.out.println("\nAB padhenge HashMap ");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("third" , 92);
        map.put("fourth" , 84);
        map.put("second" , 94);
        map.put("first" , 99);
        map.put("five" , 99);
        System.out.println(map);
        System.out.println("contains 99 value :"+map.containsValue(99));
        System.out.println("contains 99 key : "+map.containsKey(99));
        System.out.println(map);
        System.out.println("Set of key "+map.keySet());
        for(String ele : map.keySet()) System.out.print(ele+" ");
        System.out.println();
        System.out.print("values: ");
        for(Integer ele : map.values()) System.out.print(ele+" ");
        System.out.println();

        // TreeMap
        System.out.println("\nAB padhenge TreeMap ");
        TreeMap<String,Integer> tmap = new TreeMap<>();
        // it sorts key -- in case of String sorted in lexicographical order
        tmap.put("second" , 94);
        tmap.put("first" , 99);
        tmap.put("third" , 92);
        tmap.put("fourth" , 84);
        System.out.println(tmap);
        System.out.println("contains 99 value :"+tmap.containsValue(99));
        System.out.println(tmap);
        System.out.println("Set of key "+tmap.keySet());
        for(String ele : tmap.keySet()) System.out.print(ele+" ");
        System.out.println();
        System.out.println("poll first pair  : "+tmap.pollFirstEntry());
        System.out.println(tmap);

        // Arrays class
        System.out.println("\n working on Arrays");
        int[] arr = {1,77,33,22,2,3,55,99,6};
        for(int e : arr) System.out.print(e+" ");
        System.out.println();
        Arrays.sort(arr);
        for(int e : arr) System.out.print(e+" ");
        System.out.println();
        System.out.println(Arrays.binarySearch(arr , 2)); // returns the index
        System.out.println(Arrays.binarySearch(arr,999)); // not present givesneg

        // Collections class
        System.out.println("\n List ki bari ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(99);
        list.add(2);
        list.add(3);
        list.add(34);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("MIn vallue :"+Collections.min(list));
        System.out.println("Max vallue  :"+Collections.max(list));

        // Iterator interface
        Iterator it = list.iterator();
        while( it.hasNext()){
            System.out.print( it.next() +" ");
        }
    }
}

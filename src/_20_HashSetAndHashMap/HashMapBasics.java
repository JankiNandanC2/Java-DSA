package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>() ;

        // to insert/update in hashMap
        map.put("Ram" , 88);
        map.put("Rohit" ,98);
        map.put("Virat", 97);
        map.put("rana" , 100);
        System.out.println(map);

        // to search a key in map
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("raina"));

        // to search a value
        System.out.println(map.containsValue(100));
        System.out.println(map.containsValue(110));

        // to update values
        int oldValue = map.put("Virat" , 110);
        System.out.println(oldValue);
        System.out.println(map);


        // to get the value of a key
        System.out.println(map.get("Virat"));
        System.out.println(map.get("sohit")); // null if not preset

        //iterate pairs of map
        for(String key : map.keySet()){
            System.out.println(key +" "+ map.get(key));
                             //  key           value
        }

        for(int val : map.values()){
            System.out.print(val +"  ");
        }

        for(Map.Entry pair : map.entrySet()){
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }
    }
}

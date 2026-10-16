package _30_Greedy ;

import java.util.Arrays;

class Item{
    int profit , weight ;

    Item(int profit , int weight){
        this.profit = profit ;
        this.weight = weight ;
    }
}
public class FractionalKnapsack {
    public static void  sort(Item[] arr ){
        Arrays.sort( arr , ( a , b) -> {
            double ratioA = (double) a.profit / (double) a.weight ;
            double ratioB = (double) b.profit / (double) b.weight ;
            int compare = Double.compare(ratioB , ratioA );
            if( compare == 0 ) return Integer.compare(b.profit, a.profit) ; // equal ratio case
            return compare ;
        });
    }
    public static double fractionalKnapsackOperation(Item[] arr , double capacity ){
        double profit = 0d ;
        for(Item item : arr ){
            if( capacity - item.weight >= 0 ){
                capacity -= item.weight;
                profit += item.profit ;
            }else {
                double fractionalProfit = (capacity / item.weight) * item.profit ;
                profit += fractionalProfit ;
                break ;
            }
        }
        return  profit ;
    }
    public static void main(String[] args) {
        Item[] arr = { new Item(60 , 10 ) , new Item(100, 20 ) , new
        Item(120 , 30 )} ;

        int Capacity = 50 ;

        // sort Arr on basic of profit / weight ratio
        sort( arr ) ;

        // now perform the knaSack Operation
        double profit = fractionalKnapsackOperation(arr , Capacity) ;
        System.out.println("Maximum Profit is : " + profit);
    }
}

// sir ka code
/*
import java.util.Arrays;
import java.util.Comparator;

// Greedy approach
public class FractionalKnapsack {

    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr,
                                      int capacity)
    {
        // Sorting items by profit/weight ratio;
//        Arrays.sort(arr, new Comparator<ItemValue>() {
//            @Override
//            public int compare(ItemValue item1,
//                               ItemValue item2)
//            {
//                double cpr1
//                        = new Double((double)item1.profit
//                        / (double)item1.weight);
//                double cpr2
//                        = new Double((double)item2.profit
//                        / (double)item2.weight);
//
//                if (cpr1 < cpr2)
//                    return 1;
//                else
//                    return -1;
//            }
//        });

        Arrays.sort(arr, (a, b) -> {
            double ratioA = (double) a.profit / a.weight;
            double ratioB = (double) b.profit / b.weight;

            int ratioCompare = Double.compare(ratioB, ratioA); // Descending order
            if (ratioCompare == 0) {
                return Integer.compare(a.profit, b.profit); // Tie-breaker
            }
            return ratioCompare;
        });

        double totalValue = 0d;

        for (ItemValue i : arr) {

            int curWt = (int)i.weight;
            int curVal = (int)i.profit;

            if (capacity - curWt >= 0) {

                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {

                // Item cant be picked whole
                double fraction
                        = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                        = (int)(capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    // Item value class
    static class ItemValue {

        int profit, weight;

        // Item value function
        public ItemValue(int val, int wt)
        {
            this.weight = wt;
            this.profit = val;
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        ItemValue[] arr = { new ItemValue(60, 10),
                new ItemValue(100, 20),
                new ItemValue(120, 30) };

        int capacity = 50;

        double maxValue = getMaxValue(arr, capacity);

        // Function call
        System.out.println(maxValue);
    }
}

 */
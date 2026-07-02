package _20_HashSetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode3483 {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                continue;

            for (int j = 0; j < digits.length; j++) {
                if (i == j)
                    continue;

                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j || digits[k] % 2 != 0)
                        continue;

                    int num = (digits[i] * 100) + (digits[j] * 10) + (digits[k]);
                    if ((num >= 100 && num <= 999) && (num % 2 == 0))
                        set.add(num);
                }
            }
        }

        return set.size();
    }

        // method 2

    public int totalNumbers2(int[] digits) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int digit : digits)
            map.put(digit, map.getOrDefault(digit, 0) + 1);

        for (int i = 100; i <= 999; i += 2) {
            int num = i;
            int a = num % 10;
            int b = (num / 10) % 10;
            int c = (num / 100);

            int aFreq = map.getOrDefault(a, 0);
            if (aFreq > 0) {
                map.put(a, aFreq - 1);
                int bFreq = map.getOrDefault(b, 0);
                if (bFreq > 0) {
                    map.put(b, bFreq - 1);
                    int cFreq = map.getOrDefault(c, 0);
                    if (cFreq > 0) count++;
                }
                map.put(b, bFreq);
                map.put(a, aFreq);
            }
        }

        return count;
    }

}

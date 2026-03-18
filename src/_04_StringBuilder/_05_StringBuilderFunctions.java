package _04_StringBuilder;

public class _05_StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JankiNandan");
        StringBuilder db = new StringBuilder("DevakiNandan");
        System.out.println(sb.compareTo(db));  // j-d = 6 --> so output is 6
        System.out.println(sb.length()); // 11
        System.out.println(sb.capacity()); // 11 + 16 = 27
        System.out.println(sb.isEmpty());  // false
        System.out.println(sb.indexOf("k")); // index = 3
        System.out.println(sb.lastIndexOf("n")); // 10
        System.out.println(sb.reverse());  // "nadnaNiknaJ"
        System.out.println(sb.hashCode());  // 41359092

        // setCharAt() function
        StringBuilder sbb = new StringBuilder("JankiNandan");
        System.out.println(sbb);
        sbb.setCharAt(0,'M');
        System.out.println(sbb);
        sbb.setCharAt(1,'N');
        System.out.println(sbb);
        System.out.println();

    }
}

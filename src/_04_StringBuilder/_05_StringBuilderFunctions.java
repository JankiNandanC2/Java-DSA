package _04_StringBuilder;

public class _05_StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JankiNandan");
        StringBuilder db = new StringBuilder("DevakiNandan");
        System.out.println(sb.compareTo(db));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.isEmpty());
        System.out.println(sb.indexOf("k"));
        System.out.println(sb.lastIndexOf("n"));
        System.out.println(sb.reverse());
        System.out.println(sb.hashCode());

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

package _03_Strings;

public class _05_StartsWithAndContains {
    public static void main(String[] args) {
        String str = "Physics walllah skills" ;
        System.out.println(str.contains("skills"));
        System.out.println(str.contains("phy")); // case-sensitive
        System.out.println(str.contains("pw"));
        System.out.println(str.contains("ah"));
        System.out.println();
        // starts with
        System.out.println(str.startsWith("phy"));
        System.out.println(str.startsWith("Phy")); //case-sensitive
        System.out.println(str.startsWith("skills"));
        System.out.println();
        // ends with
        System.out.println(str.endsWith("lls"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Physics"));
    }
}

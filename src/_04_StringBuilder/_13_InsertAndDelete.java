package _04_StringBuilder;

public class _13_InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        sb.deleteCharAt(3); // to delete specific char at a  index
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.append("xyz");
        System.out.println(sb);
        System.out.println("length of string is : "+sb.length());
        sb.delete(4,7); // delete in a range from i to j-1
        System.out.println(sb);
        System.out.println("janki nandan");
    }
}

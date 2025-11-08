package _04_StringBuilder;

// overcome the cons of String

public class _04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("janki Nandan");
        System.out.println(sb);
        System.out.println("length of string builder is : "+sb.length());
        System.out.println("capacity of string builder is : "+sb.capacity());

        StringBuilder x = new StringBuilder(""); // empty string
        System.out.println(x);
        System.out.println("length of string builder is : "+x.length());
        System.out.println("capacity of string builder is : "+x.capacity());  // by default 16 is the capacity

        StringBuilder y = new StringBuilder(); // empty string
        System.out.println(y);
        System.out.println("length of string builder is : "+y.length());
        System.out.println("capacity of string builder is : "+y.capacity());

// capacity -- > memory is reserved continuously
        StringBuilder z = new StringBuilder(10); // capacity is  10 string builder
        System.out.println(z);
        System.out.println("length of string builder is : "+z.length());
        System.out.println("capacity of string builder is : "+z.capacity());

// string to string builder
        String s = new String("Janki nandan");
        StringBuilder za = new StringBuilder(s);
        System.out.println(za);
        System.out.println("length of string builder is : "+za.length());
        System.out.println("capacity of string builder is : "+za.capacity());
    }
}

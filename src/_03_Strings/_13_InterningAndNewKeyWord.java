package _03_Strings;

public class _13_InterningAndNewKeyWord {
    public static void main(String[] args) {

        String str = "JankiNandan";
        /*
        // strings are immutable in java
        // i.e individuals char of string cant be changed
        str.charAt(0)='M';  // error
        str.charAt(1)='k'; // error
        */
        System.out.println(str);

        // str starts pointing to Ranasittu ;
        // JankiNandan is not deleted neither replaced
        str="RanaSittu";
        System.out.println(str);

        String a = "Hello";
        String b = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b)); // compares values
        System.out.println(a==b); // compares address
        String c = "JankiNandan";
        System.out.println(c);


        // creating a new string
        String t = new String("JankiNandan");
        System.out.println(t.equals(c)); // compares value
        System.out.println(t==c); // compares address
        System.out.println(t);

    }
}

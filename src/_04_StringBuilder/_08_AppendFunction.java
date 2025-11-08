package _04_StringBuilder;

public class _08_AppendFunction {
    public static void main(String[] args) {
        // append() function
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
        s.append(70);
        System.out.println(s);
        s.append('J');
        System.out.println(s);
        s.append('*');
        System.out.println(s);

        // appending char array
        char[] ch={'a', 'e', 'i', 'o', 'u'};
        s.append(ch);
        System.out.println(s);

        // append string
        s.append(" rana sittu ");
        System.out.println(s);

        // appending stringBuilder
        StringBuilder t = new StringBuilder("jankiNandan ");
        s.append(t);
        System.out.println(s);


        // not working --> it adds adress at last
        int[] arr ={1,2,3,4,5};
        s.append(arr);
        System.out.println(s);
    }
}

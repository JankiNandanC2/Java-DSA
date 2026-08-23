package Extra;
class Student {
}
public class Main2 {

     public static void main() {
        /*
        int[] arr = new int[5];
        System.out.println(arr.getClass());
        System.out.println(arr instanceof Object);
         */

        Student[] arr = new Student[5];

        arr[0] = new Student();
        arr[1] = new Student();

        System.out.println(arr[0]);
        System.out.println(arr[4]);
    }
}

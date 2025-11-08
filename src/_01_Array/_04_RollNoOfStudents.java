package _01_Array;
import java.util.Scanner ;
public class _04_RollNoOfStudents {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No Of Students");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Marks Of Students : ");
        for (int i = 0; i <= n-1  ; i++) {
            arr[i]= scan.nextInt();
        }
        // output
        for (int i = 0; i <=n-1  ; i++) {
            if(arr[i]<35)
                System.out.print(i+" ");
        }
    }
}

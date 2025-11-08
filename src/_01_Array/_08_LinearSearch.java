package _01_Array;
import java.util.Scanner ;
public class _08_LinearSearch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter No Of Elements :  ");
        int n = scan.nextInt();

        int[] num = new int[n];
        System.out.println("Enter Elements Of Array : ");
        for (int i = 0; i <= num.length-1 ; i++) {
            num[i]= scan.nextInt();
        }

        System.out.println("Enter Target Element  : ");
        int x = scan.nextInt();

        boolean flag = false ;
        for (int i = 0; i <= num.length-1 ; i++) {
            if(num[i]==x) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("element found ");
        else
            System.out.println("Not Found");
    }
}

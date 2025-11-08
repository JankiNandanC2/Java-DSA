package _04_StringBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tnpArray {
    static void main() {
        int[] arr={1,2,3,4,5,88,9,7,11};
        int[] brr ={1,3,6,7,8,9};
        Arrays.sort(arr);
        Arrays.sort(brr);
        int lastElement=Integer.MIN_VALUE;
        int i= 0, j =0;
        while(i<arr.length && j<brr.length){
            if(arr[i]==brr[j] && arr[i] != lastElement){
                System.out.println(arr[i]+" ");
                lastElement=arr[i];
            }
            else if(arr[i]<brr[j]){
                i++;
            }
            else
                j++;
        }
    }
}

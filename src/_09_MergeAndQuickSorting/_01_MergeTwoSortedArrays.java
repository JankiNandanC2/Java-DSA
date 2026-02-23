package _09_MergeAndQuickSorting;

public class _01_MergeTwoSortedArrays {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a , int[] b, int[] c){
        int i = a.length-1 , j = b.length-1, k = c.length-1 ;
        while(i>=0 && j>=0){
            if( a[i] > b[j] ) c[k--] = a[i--];
            else c[k--] = b[j--];
        }
        if(i==0) c[k] = a[i] ;
        if(j==0) c[k] = b[j] ;
    }
    static void main(String[] args) {
        int[] a = {10,30,50,60,80,90};
        int[] b = {21,42,72,78};
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(a);
        print(b);
        print(c);
    }
}

package _09_MergeAndQuickSorting;

// Divide And Conquer

public class _02_MergeSort {
    public static void mergeSort(int[] a){
        int n = a.length;
        if(n==1) return ;
        // create 2 array to store n/2 and n-n/2 values in them respectively
        int[] left = new int[n/2];
        int[] right = new int[n-n/2];
        // copy value into left and right
        for(int i = 0 ; i < n/2 ; i++){
            left[i] = a[i];
        }
        for(int i = 0 ; i<n-n/2 ; i++){
            right[i] = a[n/2 + i ] ;
        }
        //use recursion magic
        mergeSort(left);
        mergeSort(right);

        // use sorted array concept
        merge(left ,right,a);
    }
    public static void merge(int[] a , int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if( a[i] < b[j] ) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++] ;
        while(j<b.length) c[k++] = b[j++] ;
    }
    static void main(String[] args) {
        int[] a = {80,90,10,70,30,60,40,20,50};
        mergeSort(a);
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}

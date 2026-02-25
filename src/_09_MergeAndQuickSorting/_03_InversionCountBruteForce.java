package _09_MergeAndQuickSorting;
// time complexity is -> O(n^2)
// space complexity ---> O(1)
public class _03_InversionCountBruteForce {
    static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        int count = 0 ;
        for(int i = 0 ; i<arr.length -1 ; i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    System.out.print("{"+arr[i]+","+arr[j]+"]");
                    count += 1;
                }
            }
        }
        System.out.println();
        System.out.println("total No of inversion is : "+ count);
    }
}

package _09_MergeAndQuickSorting;

public class leetcode215Improvised {
}

/*
import java.util.Random;

class Solution {

    Random rand = new Random();

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[] arr, int low, int high){
        int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(arr, pivotIndex, high);

        int pivot = arr[high];
        int i = low;

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high);
        return i;
    }

    int quickSelect(int[] arr, int low, int high, int k){
        if(low <= high){
            int pivotIndex = partition(arr, low, high);

            if(pivotIndex == k)
                return arr[pivotIndex];

            if(pivotIndex > k)
                return quickSelect(arr, low, pivotIndex-1, k);
            else
                return quickSelect(arr, pivotIndex+1, high, k);
        }
        return -1;
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n-1, n-k);
    }
}
 */
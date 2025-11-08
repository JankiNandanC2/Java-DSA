package _01_Array;

public class _24_MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1= {1,3,4,7,15,99,103,109};
        int [] nums2 = {2,5,6,8,11,18,33,66};
        int m = nums1.length , n = nums2.length ;
        int[] res = new int[m+n];
        int i = 0 , j = 0 , k= 0 ;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums2[j]<nums1[i]){
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(m<n){
            while(k<res.length){
                res[k++]=nums2[j++];
            }
        }
        else{
            while(k< res.length){
                res[k++]=nums1[i++];
            }
        }
        for(int ele: res){
            System.out.print(ele + " ");
        }
    }
}

package _01_Array;

public class _25_MergeTwoSortedArrayMethod2 {
    public static void main(String[] args) {
        int[] nums1= {1,3,4,7,15,99,103};
        int [] nums2 = {2,5,6,8,11,18,33,66,77,83,89,105};
        int[] res = new int[nums1.length + nums2.length ];
        int m = nums1.length , n = nums2.length , size = res.length;
        int i = m-1 , j = n-1 , k = size-1 ;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                res[k]= nums1[i];
                k--;
                i--;
            }
            else{
                res[k]= nums2[j];
                k--;
                j--;
            }
        }
        if(i==0) res[k]=nums1[i];
        if(j==0) res[k]=nums2[j];
        for(int ele: res){
            System.out.print(ele + " ");
        }
    }
}

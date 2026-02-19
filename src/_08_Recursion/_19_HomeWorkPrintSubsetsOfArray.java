package _08_Recursion;
// leetcode 78
// do it yourself
public class _19_HomeWorkPrintSubsetsOfArray {
    static void main(String[] args) {

    }
}
/*
class Solution {
    static ArrayList<List<Integer>> finalList = new ArrayList<>();
    public void subsets(int i , int[] nums, ArrayList<Integer> ans){
        if(i==nums.length ){
            // created a  copy of the ans to pass it in finalList
            ArrayList<Integer> list  = new ArrayList<>();
            for(int j = 0 ; j < ans.size() ; j++){
                list.add(ans.get(j));
            }
            finalList.add(list);
            return ;
        }
        subsets(i+1 , nums, ans );  // not take
        ans.add(nums[i]) ; // work
        subsets(i+1 , nums , ans);  //take
        ans.remove(ans.size()-1);  // remove the last elememt after adding it as it passed by refrerence
    }
    public List<List<Integer>> subsets(int[] nums) {
        finalList = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        subsets(0,nums,ans) ;
        return finalList ;
    }
}
 */

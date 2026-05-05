package _12_LinkedListPart2;

public class hw6Leetcode2326 {
}
/*
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int mnRow = 0 , mxRow = m - 1  ;
        int mnCol = 0 , mxCol = n - 1 ;
        ListNode temp = head ;
        while(mnRow <= mxRow && mnCol <= mxCol ){
            // left to right
            if(mnRow > mxRow || mnCol > mxCol) break ;
            for(int j = mnCol ; j <= mxCol ; j++ ){
                if(temp == null) ans[mnRow][j] = -1 ;
                else{
                    ans[mnRow][j] = temp.val;
                    temp = temp.next ;
                }
            }
            mnRow++ ;
            // top to down
            if(mnRow > mxRow || mnCol > mxCol) break ;
             for(int k = mnRow ; k <= mxRow ; k++ ){
                if(temp == null) ans[k][mxCol] = -1 ;
                else {
                    ans[k][mxCol] = temp.val;
                    temp = temp.next ;
                }
            }
            mxCol-- ;
            // right to left
            if(mnRow > mxRow || mnCol > mxCol) break ;
            for(int l = mxCol ; l >= mnCol ; l-- ){
                if(temp == null) ans[mxRow][l] = -1 ;
                else {
                    ans[mxRow][l] = temp.val;
                    temp = temp.next ;
                }
            }
            mxRow--;
            // bottom to top
            if(mnRow > mxRow || mnCol > mxCol) break ;
            for(int i = mxRow ; i>= mnRow ; i-- ){
                if(temp == null)  ans[i][mnCol] = -1 ;
                else{
                    ans[i][mnCol] = temp.val;
                    temp = temp.next ;
                }
            }
            mnCol++ ;
        }
        return ans ;
    }
}
 */
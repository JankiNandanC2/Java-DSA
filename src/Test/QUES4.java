package Test;

public class QUES4 {
    static void main(String[] args) {
        int[] arr ={4,5,2,10};
        int[] ans = nextGreaterElement(arr);
        for(int ele: ans){
            System.out.println(ele);
        }
    }
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }
}

package _01_Array;

public class _03_DeclarationInitialisation {
    public static void main(String[] args) {
    int[] arr = {1,3,5,7,9,11,13,15};
        System.out.println("size of array is : "+arr.length);

        for(int i = 0 ; i<= (arr.length)-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

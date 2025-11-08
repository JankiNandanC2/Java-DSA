package _04_StringBuilder;

import java.util.Arrays;

public class _12_SortingString {
    public static void main(String[] args) {

        // either all alphabets in capital or small

        // char arr can we sorted using arrays.sort
        char[] ch={'j','a','n','k','i'};
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        // string are immutable in java , and string cannot be sorted
        String s = "jankinandan";
        System.out.println(s);
        // string can be converted to char arr to be sorted
        ch=s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        // to sort stringBuilder convert to string then to char array then sorty
        StringBuilder sb = new StringBuilder("ranasittu");
//        String str = sb.toString();
        char[] cha =sb.toString().toCharArray();
        Arrays.sort(cha);
        for(char ele : cha){
            System.out.print(ele);
        }
        System.out.println();
    }
}

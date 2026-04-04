package _08_Recursion;

public class _01_FunctionCalls {
    public static void mango(){
        System.out.println("hi ! this is mango"); // 2 , 5
    }
    public static void banana(){
        mango();
        System.out.println("hi ! this is banana"); // 3
    }
    public static void apple(){
        banana();
        System.out.println("hi ! this is apple"); // 4
        mango();
    }
    static void main(String[] args) {
        System.out.println("hi ! this is main method "); // 1
        apple();
    }
}

package _08_Recursion;

public class _01_FunctionCalls {
    public static void mango(){
        System.out.println("hi ! this is mango");
    }
    public static void banana(){
        mango();
        System.out.println("hi ! this is banana");
    }
    public static void apple(){
        banana();
        System.out.println("hi ! this is apple");
        mango();
    }
    static void main(String[] args) {
        System.out.println("hi ! this is main method ");
        apple();
    }
}

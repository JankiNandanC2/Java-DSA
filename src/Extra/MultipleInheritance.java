package Extra;
interface Animal{
    default void sharedMethod(){
        System.out.println("Animal Interface");
    };
}
interface A extends Animal{

    @Override
    default void sharedMethod(){
        System.out.println("Interface A");
    }
}
interface B extends Animal{
    @Override
    default void sharedMethod(){
        System.out.println("Interface B");
    }
}
class Hybrid implements A , B {

    @Override
    public void sharedMethod() {
        B.super.sharedMethod();
    }

}

// cannot do this java restrict it
/*
class X {}
class Y {}
class Z extends X , Y {}
 */

interface Y {
    default void commonMethod(){
        System.out.println("Y impl ");
    };

}
interface Z extends  Y  {
    @Override
    default void commonMethod(){
        System.out.println("This is Z impl ");
    };
}
class X implements Y ,Z{
//    @Override
//    public void commonMethod(){
//        System.out.println("This is X impl ");
//    };
}

public class MultipleInheritance {
    static void main(String[] args) {
        X object = new  X();
        object.commonMethod();

//        Hybrid hybrid = new Hybrid();
//        hybrid.sharedMethod();
    }
}

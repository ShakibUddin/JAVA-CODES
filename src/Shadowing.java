class A{
    public static void fun(int a){
        System.out.println("Static a is "+a);
    }
    public void fun2(int a){
        System.out.println("Non Static a is "+a);
    }
}
class B extends A{
    public static void fun(int a){
        System.out.println("Static a+2 is "+(a+2));
    }
    public void fun2(int a){
        System.out.println("Non Static a+2 is "+(a+2));
    }
}

public class Shadowing {
    //In Java,
    // if the name of a derived class static function is the same as a base class static function
    // then the base class static function shadows (or conceals) the derived class static function.
    public static void main(String[] args){
        A obj = new B();
        //CALLING STATIC METHODS
        A.fun(5);//Output is 'a is 5'
        //A superclass's fun is called
        //because
        //=>>While both methods are static types,
        // the variable type decides the method being invoked, not the assigned object type

        //CALLING NON STATIC METHODS
        A obj3 = new B();
        obj3.fun2(10);//Output is 'Non Static a+2 is 12'
        //B subclass's fun2() is called
        //because
        //=>>While both methods are non static types,
        // the assigned object type  decides the method being invoked, not the variable type


    }
}

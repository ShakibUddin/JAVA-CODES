//Unlike C++, Java supports a special block, called static block (also called static clause)
// which can be used for static initializations of a class.
// This code inside static block is executed only once:
//Also, static blocks are executed before constructors. For example, check output of following Java program.
class Test{
    static int i=0;
    {//Instance initializer block or non static block
        //Initialization blocks are executed whenever the class is initialized and before constructors are invoked.
        //They are typically placed above the constructors within braces.
        //They are called after static block and before constructor
        System.out.println("Instance initializer block or non static block");
    }
    Test(){
        System.out.println("Class constructor");
    }
    static{
        i=10;//i is initialised in static block
        System.out.println("Static block");
    }
    //Initializer block contains the code that is always executed whenever an instance is created.
    // It is used to declare/initialize the common part of various constructors of a class.
    {//this is initializer block
        i=9;//i is reinitialised in static block
    }
}

public class Blocks {
    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(Test.i);
    }
}
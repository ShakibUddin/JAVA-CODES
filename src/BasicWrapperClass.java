import java.util.ArrayList;

public class BasicWrapperClass {
    //A Wrapper class is a class whose object wraps or contains a primitive data types.
    public static void main(String[] args){
        //Primitive data types->Wrapper Class
        //int,long->Integer, char->Character, byte->Byte, short->Short, float->Float, double->Double, boolean->Boolean

        //Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
        // For example – conversion of int to Integer
        //Autoboxing is shown below
        byte b = 2;
        Byte objB = new Byte(b);
        int i = 4;
        Integer objI = new Integer(i);
        float f = 2.30f;
        Float objF = new Float(f);
        double d = 7.34567;
        Double objD = new Double(d);
        char c = 'M';
        Character objC = new Character(c);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));

        System.out.println("Result of autoboxing");
        System.out.println("objB is "+objB);
        System.out.println("objI is "+objI);
        System.out.println("objF is "+objF);
        System.out.println("objD is "+objD);
        System.out.println("objC is "+objC);

        // It is just the reverse process of autoboxing.
        // Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing.
        // For example – conversion of Integer to int
        //Unboxing is shown below

        b = objB;
        i = objI;
        f = objF;
        d = objD;
        c = objC;

        arrayList = new ArrayList<Integer>();
        arrayList.add(24);

        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);

        // printing the values from primitive data types
        System.out.println(num);

        System.out.println("Result of unboxing");
        System.out.println("byte b is "+b);
        System.out.println("int i is "+i);
        System.out.println("float f is "+f);
        System.out.println("double d is "+d);
        System.out.println("char c is "+c);

        //Why we need Wrapper Class
        //=>> Wrapper Class will convert primitive data types into objects.
        // The objects are necessary if we wish to modify the arguments passed into the method
        // (because primitive types are passed by value).
        //=>>The classes in java.util package handles only objects and hence wrapper classes help in this case also.
        //=>>Data structures in the Collection framework such as ArrayList and Vector store only the objects
        // (reference types) and not the primitive types.
        //=>>The object is needed to support synchronization in multithreading.
    }
}

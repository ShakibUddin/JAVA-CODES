interface one//java does not support multiple inheritance with class so interface is used
{
    public void print_sakib();
}
//Like a class, an interface can have methods and variables,
// but the methods declared in an interface are by default abstract (only method signature, no body).
//Why do we use interface ?
//
//It is used to achieve total abstraction.
//Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
//It is also used to achieve loose coupling.
//New features added in interfaces in JDK 8
//
//Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods.
// This default implementation has special use and does not affect the intention behind interfaces.
//Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object.
// Note: these methods are not inherited.
interface two
{
    public void print_loves();
}

interface three extends one,two//inheriting both class one and two
{
    public void print_java();
}
class child implements three
{
    public void print_sakib(){System.out.println("Sakib");}
    public void print_loves() {
        System.out.println("Loves");
    }

    public void print_java()
    {
        System.out.println("Java");
    }
}
public class MultipleInheritance {
    public static void main(String[] args)
    {
        child c = new child();
        c.print_sakib();
        c.print_loves();
        c.print_java();
    }
}

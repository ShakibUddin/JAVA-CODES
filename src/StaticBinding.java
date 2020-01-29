//Static Binding: The binding which can be resolved at compile time by compiler is known as static or early binding.
// Binding of all the static, private and final methods is done at compile-time .
public class StaticBinding {
    public static class SuperClass{
        public static void print(){
            System.out.println("Superclass");
        }
    }
    public static class SubClass extends SuperClass{
        public static void print(){
            System.out.println("Subclass");
        }
    }
    public static void main(String[] args){
        SuperClass obj = new SuperClass();
        SuperClass obj2 = new SubClass();
        obj.print();
        obj2.print();
        //OUTPUT:
        // Superclass
        // Superclass
        //We have created one object of subclass and one object of superclass with the reference of the superclass.
        //Since the print method of superclass is static, compiler knows that it will not be overridden in subclasses
        // and hence compiler knows during compile time which print method to call and hence no ambiguity.
    }
}

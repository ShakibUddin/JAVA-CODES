//Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called.
// Overriding is a perfect example of dynamic binding.
// In overriding both parent and child classes have same method .
public class DynamicBinding {
    public static class Parent{
        public void print(){
            System.out.println("Superclass");
        }
    }
    public static class Child extends Parent {
        public void print(){
            System.out.println("Subclass");
        }
    }
    public static void main(String[] args){
        Parent obj = new Parent();
        Parent obj2 = new Child();
        obj.print();
        obj2.print();
        //OUTPUT:
        // Superclass
        // Subclass
        //Methods are not static in this code.
        //During compilation,
        // the compiler has no idea as to which print has to be called
        // since compiler goes only by referencing variable not by type of object and
        // therefore the binding would be delayed to runtime and
        // therefore the corresponding version of print will be called based on type of object.
    }
}

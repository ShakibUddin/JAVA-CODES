class P{
    public void love(){
        System.out.println("Very");
    }

}
class Q extends P{
    public void sakib(){
        System.out.println("Sakib Loves");
    }
}
class R extends P{
    public void codingJava(){
        System.out.println("Java");
    }
}
public class HierarchicalInheritance {
    // In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class.
    public static void main(String[] args){
        Q obj1 = new Q();
        R obj2 = new R();
        obj1.sakib();
        obj2.codingJava();
        obj1.love();
        obj2.love();
        System.out.println("Much");
    }
}

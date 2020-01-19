class One{
    int a=10;
    public One(int n){
        this.a=n;
    }
}
class Two extends One{

    public Two(int n) {
        super(n);//super(n) is actually super class's constructor
    }
}
public class SingleInheritance {
    // In single inheritance, subclasses inherit the features of one superclass.
    public static void main(String[] args){
        Two obj = new Two(30);
        System.out.println("a is "+obj.a);
        //a goes in Class Two's constructor and the that goes as n in super(n) which is actually Class One's constructor
    }
}

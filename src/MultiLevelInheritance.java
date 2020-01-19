class X{
    int a=10;
    public X(int n){
        this.a=n;
    }
}
class Y extends X{

    public Y(int n) {
        super(n+10);//super(n) is actually Xclass's constructor
    }
}
class Z extends Y{

    public Z(int m) {
        super(m);////super(m) is actually Y class's constructor
    }
}
public class MultiLevelInheritance {
    //In Multilevel Inheritance, a derived class will be inheriting a base class and
    // as well as the derived class also act as the base class to other class.
    public static void main(String[] args){
        Z obj = new Z(1);
        System.out.println("a is "+obj.a);//output is 11
        //1 goes to super(m) as m, which is Y class's constructor where 10 is added with 1 which came as n in Y
        //then 1+10=11 goes to X Class's constructor and a is updated as 11
    }
}

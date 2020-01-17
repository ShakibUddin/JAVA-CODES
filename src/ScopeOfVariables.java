public class ScopeOfVariables {
    static int x=10;
    private int y=19;
    private void method(int x){
        ScopeOfVariables obj1 = new ScopeOfVariables();
        ScopeOfVariables obj2 = new ScopeOfVariables();
        this.x=x;//this keyword is used to reference the current class variable.
        int y=20;
        obj1.y=21;
        obj2.y=22;
        System.out.println("x is "+x);
        System.out.println("instance variable y is "+this.y);
        System.out.println("local variable y is "+y);
        System.out.println("obj1.y is "+obj1.y);
        System.out.println("obj2.y is "+obj2.y);
    }
    public static void main(String[] args){
        ScopeOfVariables obj = new ScopeOfVariables();
        obj.method(1);
        //Loop Variables (Block Scope)
        //A variable declared inside pair of brackets “{” and “}” in a method has scope withing the brackets only.
        {
            int loopVariable = 100;
            System.out.println("loop variable is "+loopVariable);
        }
        //System.out.println("loop variable is "+loopVariable); ERROR...because it exists only in the above curly braces {}

    }
}

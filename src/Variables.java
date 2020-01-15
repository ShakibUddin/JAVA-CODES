public class Variables {
    //There are three types of variables in Java:
    //
    //Local Variables
    //Instance Variables
    //Static Variables
    public static  void main(String[] args){
        Variables obj = new Variables();
        InstanceAndStaticVariable obj2 = new InstanceAndStaticVariable();
        obj2.instanceNum=100;
        InstanceAndStaticVariable.staticNum = 500;//no need to create object
        InstanceAndStaticVariable obj3 = new InstanceAndStaticVariable();
        obj3.instanceNum=200;
        //to access that an object has to be created
        System.out.println("age is "+obj.userAge());
        System.out.println("instanceNum of obj2 is "+obj2.instanceNum);
        System.out.println("instanceNum of obj3 is "+obj3.instanceNum);
        System.out.println("staticNum of InstanceAndStaticVariable class is "+InstanceAndStaticVariable.staticNum);
        //A variable defined within a block or method or constructor is called local variable.

        //Instance variables are non-static variables and are declared in a class outside any method,constructor or block.
        //Unlike local variables, we may use access specifiers for instance variables.
        // If we do not specify any access specifier then the default access specifier will be used.
        //Initilisation of Instance Variable is not Mandatory. Its default value is 0
        //Instance Variable can be accessed only by creating objects.

        //static variables and instance varibales are almost same
        //EXCEPT !!!
        //=>static variables are declared using the static keyword within a class outside any method constructor or block.
        //=>Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
        //To access static variables, we need not create an object of that class, we can simply access the variable
        // as
        //class_name.variable_name;
    }
    public int userAge(){
        int age=24;//local variable
        return age;
    }
}
class InstanceAndStaticVariable{
    static int staticNum = 4;//static variable
    int instanceNum = 7;//instance variable,in a class..so object needs to be created to access it
}
//OUTPUT :
//age is 24
//instanceNum of obj2 is 100
//instanceNum of obj3 is 200
//staticNum of InstanceAndStaticVariable class is 500
//2nd and 3rd line proves that each object will have its own copy of instance variable.

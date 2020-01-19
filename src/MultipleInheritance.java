interface one//java does not support multiple inheritance with class so interface is used
{
    public void print_sakib();
}

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

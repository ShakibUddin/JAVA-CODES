//Abstraction is detail hiding(implementation hiding).
//In Java, we can have an abstract class without any abstract method.
// This allows us to create classes that cannot be instantiated,
// but can only be inherited.
//Abstract classes can also have final methods (methods that cannot be overridden).
//an abstract class can contain constructors in Java.
// And a constructor of abstract class is called when an instance of a inherited class is created.
abstract class ShinobiInfo{
    public String name;
    private int numberOfCompletedMissions;
    private String type;
    abstract void setInfo(int noMission,String type);
    abstract String getInfo();
    public ShinobiInfo(String name){
        this.name=name;
    }
}
class Jounin extends ShinobiInfo{
    private int noMission;
    private String type;
    Jounin(String name){
        super(name);
    }
    @Override
    void setInfo(int noMission, String type) {
        this.noMission=noMission;
        this.type=type;
    }
    @Override
    String getInfo() {
        return super.name+" is a Jounin and has completed "+noMission+" missions. "+super.name+" is skilled in "+type;
    }
}
class Genin extends ShinobiInfo{
    private int noMission;
    private String type;
    Genin(String name){
        super(name);
    }
    @Override
    void setInfo(int noMission, String type) {
        this.noMission=noMission;
        this.type=type;
    }
    @Override
    String getInfo() {
        return super.name+" is a Genin and has completed "+noMission+" missions. "+super.name+" is skilled in "+type;
    }
}
public class AbstractionTest {
    public static void main(String[] args){
        Jounin Sasuke = new Jounin("Uchiha Sasuke");
        Genin Boruto  = new Genin("Uzumaki Boruto");
        Sasuke.setInfo(57,"Ninjutsu,Genjutsu,Taijutsu,Doujutsu");
        Boruto.setInfo(7,"Ninjutsu,Taijutsu");
        System.out.println(Sasuke.getInfo());
        System.out.println(Boruto.getInfo());
    }
}
//Abstract classes and Abstract methods :
//
//An abstract class is a class that is declared with abstract keyword.
//An abstract method is a method that is declared without an implementation.
//An abstract class may or may not have all abstract methods. Some of them can be concrete methods
//A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
//Any class that contains one or more abstract methods must also be declared with abstract keyword.
//There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
//An abstract class can have parametrized constructors and default constructor is always present in an abstract class.

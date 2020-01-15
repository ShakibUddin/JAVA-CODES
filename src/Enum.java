enum Shinobi{
    //Enum declaration can be done outside a Class or inside a Class but not inside a Method.
    //According to Java naming conventions, it is recommended that we name constant with all capital letters
    NARUTO("Hokage"),SASUKE("Jounin"),BORUTO("Genin");//customized enum
    private String title="";
    Shinobi(String s){
        this.title=s;
    }
    public String showTitle(){
        return title;
    }
}
public class Enum {
    public static void main(String[] args){
        System.out.println("Shinobi Ranks\n");
        for(Shinobi s : Shinobi.values()){
            System.out.println(s.name()+"'s rank is "+s.showTitle()+"\n");
        }
    }
}

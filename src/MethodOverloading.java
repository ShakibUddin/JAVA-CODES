import java.util.List;

class Title{
    private String title;
    private String[] kage=new String[]{"Naruto","Sasuke","Kakashi","Sakura"};
    private String[] jounin=new String[]{"Shikamaru","Konohamaru","Neji","Ino","Choji"};
    private String[] chunin=new String[]{"Boruto","Sarada","Mitsuki"};
    private String[] gennin=new String[]{"Shikadai","Inojin","Sumire"};
    public String getTitle(String name){
        for(String title:kage){
            if(name.equals(title)){
                this.title="Kage";
                break;
            }
        }
        for(String title:jounin){
            if(name.equals(title)){
                this.title="Jounin";
                break;
            }
        }
        for(String title:chunin){
            if(name.equals(title)){
                this.title="Chunin";
                break;
            }
        }
        for(String title:gennin){
            if(name.equals(title)){
                this.title="Gennin";
                break;
            }
        }
        return title;
    }
    public String getTitle(int Arank,int Brank,int Crank,int Drank){
        if(Arank>=30){
            this.title="Kage";
        }
        else if(Arank<=20 && Arank>=10){
            this.title="Jounin";
        }
        else if(Arank<10 && Brank>=10){
            this.title="Chunin";
        }
        else if(Arank==0 && Brank>=3 && Brank<=6 && Crank>10 && Drank>10){
            this.title="Gennin";
        }
        return title;
    }
    public String getTitle(int Srank){
        if(Srank>5){
            this.title="Kage";
        }
        return title;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Title obj = new Title();
        System.out.println("Naruto is at "+obj.getTitle("Naruto")+" level");
        System.out.println("Sasuke is at "+obj.getTitle(9)+" level");
        System.out.println("Boruto is at "+obj.getTitle("Boruto")+" level");
        System.out.println("Konohamaru is at "+obj.getTitle(15,21,8,7)+" level");
    }
}

class AutoMessage{
    public void getMessage(){
     System.out.println("Welcome User");
    }
}
class Response extends AutoMessage{
    String user;
    public Response(String user){
        this.user=user;
    }
    @Override
    public void getMessage(){//Overriding getMessage to do something different
        if(user.equals("Admin")){
            System.out.println("Hello Admin");
        }
        else{
            System.out.println("Hello "+user);
        }
    }
}
public class MethodOverRiding {
    public static void main(String[] args){
        AutoMessage obj = new AutoMessage();
        obj.getMessage();
        Response obj2 = new Response("Sakib");
        obj2.getMessage();
    }
}

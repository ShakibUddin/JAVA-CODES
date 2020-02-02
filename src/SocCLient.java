import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocCLient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",4999);
        Scanner sc = new Scanner(System.in);
        String clientReply="";
        String serverReply="";
        System.out.println("Connection Successful");
        while(!serverReply.equals("Ok")){
            System.out.print("Asif : ");
            clientReply=sc.nextLine();
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println(clientReply);
            pr.flush();

            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(in);
            serverReply = br.readLine();
            System.out.println("Sakib : "+serverReply);
        }
        s.close();
    }

}
























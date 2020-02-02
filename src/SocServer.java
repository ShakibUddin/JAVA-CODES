import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
        System.out.println("Connection Successful");
        Scanner sc = new Scanner(System.in);
        String clientReply="";
        String serverReply="";

        while(!clientReply.equals("Ok")){
            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(in);
            clientReply = br.readLine();
            System.out.println("Asif : "+clientReply);

            System.out.print("Sakib : ");
            serverReply=sc.nextLine();
            PrintWriter pr = new PrintWriter(s.getOutputStream());
            pr.println(serverReply);
            pr.flush();
        }
        s.close();

    }
}
























package SocketProg;
import java.io.*;
import java.net.*;
import java.util.LinkedList;
import java.util.List;

public class GreetServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        System.out.println("New Connection");
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        out.println(greeting);
        List l= new LinkedList<>();
        l.add("sds");



        System.out.println(greeting);

    }
        public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String[] args) throws Exception {
        GreetServer server=new GreetServer();
        server.start(4444);
    }
}

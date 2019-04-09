import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(8189);
            socket = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Сервер запущен!");


        ObjectInputStream ois;
        ois = new ObjectInputStream(new FileInputStream("player.plr"));
        Player player2 = (Player) ois.readObject();
        ois.close();
        player2.info();
    }
}









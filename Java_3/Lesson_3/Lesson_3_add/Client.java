import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {
    public static void main(String[] args) {
        Socket socket=null;
        try {
            socket = new Socket("localhost", 8189);

               Player player = new Player(1, "Bob");
               ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("player.plr"));
               ous.writeObject(player);
               ous.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
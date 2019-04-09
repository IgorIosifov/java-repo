import java.io.Serializable;

public class Player implements Serializable {
    int id;
    String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void info() {
        System.out.println(id + " " + name);
    }
}

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private Semaphore tunnel = new Semaphore(MainClass.CARS_COUNT / 2);

    public Tunnel() {
        this.length = 80;
        this.description = "Tunnel " + length + " metres";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " is preparing to stage (waiting) " + description);
                tunnel.acquire();
                System.out.println(c.getName() + " has begun the stage: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " has finished the stage: " + description);
                tunnel.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
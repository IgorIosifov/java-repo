public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Road " + length + " metres";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " has begun the stage: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " has finished the stage: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
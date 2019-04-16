class Letter {
    private String str;
    private int counter; // this counter is needed for "wait-notifyAll" blocks

    //default constructor

    //print "A" in case if counter%3 == 0
    synchronized void setA() {
        while ((counter) % 3 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        str = "A";
        counter++;
        System.out.print(str);
        try {
            Thread.sleep(501);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    //print "B" in case if (counter-1)%3 == 0
    synchronized void setB() {
        while ((counter - 1) % 3 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        str = "B";
        counter++;
        System.out.print(str);
        try {
            Thread.sleep(502);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    //print "C" in case if (counter-2)%3 == 0
    synchronized void setC() {
        while ((counter - 2) % 3 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        str = "С";
        counter++;
        System.out.print(str);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }
}

class Main {
    public static void main(String[] args) {

        final Letter letter = new Letter();

        //print "ABC" 5 times

        for (int i = 0; i < 5; i++) {

            //print "A" thread

            new Thread(new Runnable() {
                public void run() {
                    letter.setA();
                }
            }
            ).start();

            //print "B" thread

            new Thread(new Runnable() {
                public void run() {
                    letter.setB();
                }
            }
            ).start();

            //print "C" thread

            new Thread(new Runnable() {
                public void run() {
                    letter.setC();
                }
            }
            ).start();
        }
    }
}
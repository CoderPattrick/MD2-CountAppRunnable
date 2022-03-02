public class Count implements Runnable{
    private Thread myThread;

    public Count() {
        myThread = new Thread(this,"MaThread");
        System.out.println(myThread + " created");
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted");
        }
        System.out.println("Thread run is over");
    }
}

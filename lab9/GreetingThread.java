package lab9;

public class GreetingThread implements Runnable {
    private final String greeting;
    private final long intervalMillis;

    public GreetingThread(String greeting, long intervalMillis) {
        this.greeting = greeting;
        this.intervalMillis = intervalMillis;
    }


    public void run() {
        try {
            while (true) {
                System.out.println(greeting);
                Thread.sleep(intervalMillis);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread morningThread = new Thread(new GreetingThread("Good Morning", 1000));
        Thread afternoonThread = new Thread(new GreetingThread("Good Afternoon", 3000));

        morningThread.start();
        afternoonThread.start();
    }
}
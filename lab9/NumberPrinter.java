package lab9;

public class NumberPrinter {
    public static void main(String[] args) {

        Thread oddThread = new Thread(new OddNumberRunnable());
        Thread evenThread = new Thread(new EvenNumberRunnable());

        oddThread.start();
        evenThread.start();
    }
}

class OddNumberRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenNumberRunnable implements Runnable {
    
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}
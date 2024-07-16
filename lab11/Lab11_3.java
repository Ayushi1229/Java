import java.io.FileOutputStream;
import java.io.IOException;

class FileWriterThread extends Thread {ch
    private String fileName;
    private int startRange;
    private int endRange;

    public FileWriterThread(String fileName, int startRange, int endRange) {
        this.fileName = fileName;
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public void run() {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);

            for (int i = startRange; i <= endRange; i++) {
                outputStream.write(i);
            }

            outputStream.close();
            System.out.println("Thread writing to file " + fileName + " completed.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Lab11_3 {
    public static void main(String[] args) {
        String fileName = "output.bin";
        int totalNumbers = 10000;
        int threads = 4;
        int numbersPerThread = totalNumbers / threads;

        Thread[] writerThreads = new Thread[threads];
        int startRange = 0;
        int endRange = numbersPerThread;

        for (int i = 0; i < threads; i++) {
            writerThreads[i] = new FileWriterThread(fileName, startRange, endRange);
            startRange = endRange + 1;
            endRange = startRange + numbersPerThread - 1;
        }

        for (Thread writerThread : writerThreads) {
            writerThread.start();
        }

        for (Thread writerThread : writerThreads) {
            try {
                writerThread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
                writerThread.yield();
            }
        }

        int randomThreadIndex = (int) (Math.random() * threads);
        writerThreads[randomThreadIndex].interrupt();
    }
}
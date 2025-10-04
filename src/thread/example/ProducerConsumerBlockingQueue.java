package thread.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {
    public static void main(String[] args) {
        // Shared buffer with capacity = 5
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (true) {
                    System.out.println("Produced: " + i);
                    queue.put(i++);  // waits automatically if queue is full
                    Thread.sleep(500); // simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int value = queue.take(); // waits automatically if queue is empty
                    System.out.println("Consumed: " + value);
                    Thread.sleep(1000); // simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

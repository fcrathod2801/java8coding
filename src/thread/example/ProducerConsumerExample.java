package thread.example;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer full, producer waiting...");
            wait(); // release lock, wait until consumer consumes
        }

        buffer.add(value);
        System.out.println("Produced: " + value);

        notify(); // wake up consumer if waiting
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer empty, consumer waiting...");
            wait(); // release lock, wait until producer produces
        }

        int value = buffer.poll();
        System.out.println("Consumed: " + value);

        notify(); // wake up producer if waiting
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            int i = 1;
            try {
                while (true) {
                    buffer.produce(i++);
                    Thread.sleep(500); // simulate time to produce
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(1000); // simulate time to consume
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

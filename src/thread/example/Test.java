package thread.example;

class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1: going to sleep...");
            try {
                Thread.sleep(2000); // sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: woke up!");
        });

        t1.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2: going to sleep...");
            try {
                Thread.sleep(3000); // sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: woke up!");
        });

        t2.start();
    }
}

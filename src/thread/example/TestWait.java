package thread.example;

public class TestWait {
    public static void main(String ar[]){

        Object lock=new Object();

        Thread t1=new Thread(
                ()-> {
                    synchronized (lock) {
                        System.out.println("Thread 1 : waiting for Notification..!");
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {

                        }
                        System.out.println("Thread 1 : getting notification");
                    }
                }
        );

        Thread t2=new Thread(
                ()->{
                    synchronized (lock) {
                        System.out.println("Thread 2: Notification triggered");
                        lock.notify();
                        System.out.println("Thread 2 : Notified done");
                    }
    }
        );
        t1.start();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){

        }
        t2.start();
    }
}

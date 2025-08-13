// Step 1: Create a class that implements Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Step 2: Create Runnable object
        MyRunnable task = new MyRunnable();

        // Step 3: Create Thread objects and pass Runnable object
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        // Step 4: Start the threads
        t1.start();
        t2.start();
    }
}

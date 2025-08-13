
//Extending thread class in a custom class 
class MyThread extends Thread {
    //overriding run method
    public void run() {
        // Code to be executed in this thread
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

public class ThreadExample {
    public static void main(String[] args) {
        // Step 2: Create objects of MyThread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Step 3: Start the threads
        t1.start();
      
        t2.start();
    }
    
}

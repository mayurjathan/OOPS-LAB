class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " was interrupted.");
                return; // Exit the thread if interrupted
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(), "Thread 1");
        Thread thread2 = new Thread(new MyThread(), "Thread 2");

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1.start();
        thread2.start();

        try {
            // Wait for threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Main thread finished.");
    }
}
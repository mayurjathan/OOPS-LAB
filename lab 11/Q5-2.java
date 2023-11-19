class SharedResource {
    private int counter = 0;

    // Synchronized method to increment the counter
    public void increment() {
        synchronized(this){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Incrementing: " + (++counter));
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(String name, SharedResource sharedResource) {
        super(name);
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.increment();
    }
}

class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create two threads sharing the same resource
        Thread thread1 = new MyThread("Thread 1", sharedResource);
        Thread thread2 = new MyThread("Thread 2", sharedResource);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
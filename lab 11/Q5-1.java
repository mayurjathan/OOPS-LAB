//Write a program to synchronize two different threads
// a. Using synchronized method.
class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Simulate some processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread implements Runnable {
    SharedResource sharedResource;
    int n;

    public MyThread(SharedResource sharedResource, int n) {
        this.sharedResource = sharedResource;
        this.n = n;
    }

    @Override
    public void run() {
        sharedResource.printNumbers(n);
    }
}

 class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(new MyThread(sharedResource, 5));
        Thread thread2 = new Thread(new MyThread(sharedResource, 5));

        thread1.start();
        thread2.start();
    }
}
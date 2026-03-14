class MyThread1 implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
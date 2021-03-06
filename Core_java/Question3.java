package Core_java;
class Find extends Thread {
    public void run() {
        try {
            System.out.println("find started.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("find completed.");
    }
    public static void main(String args[]) {
        Find f = new Find();
        f.start();
    }
}

class getData implements Runnable {
    public void run() {
        try {
            System.out.println("getData started.");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);

        }
        System.out.println("getData completed.");
    }
    public static void main(String args[]) {
        getData gd = new getData();
        Thread thread = new Thread(gd);
        thread.start();
    }
}

public class Question3 {
    public static void main(String args[]) {
        Find f = new Find();
        getData pd = new getData();
        Thread threads = new Thread(pd);
        threads.setPriority(Thread.MIN_PRIORITY);
        f.setPriority(Thread.MAX_PRIORITY);
        try {
            f.start();
            f.join();
            threads.start();
        } catch(InterruptedException e) {
             System.out.println(e);    
        }

    }
}


public class MyThread implements Runnable {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }


    public void run() {
        System.out.println("start execute thread: " + id);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("stop execute thread: " + id);
    }
}
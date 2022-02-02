package lesson17;


public class Main {
    public static void main(String[] args) {

        Thread myThread = new Thread( new MyThread());
        myThread.start();

        for (int i=0; i< 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

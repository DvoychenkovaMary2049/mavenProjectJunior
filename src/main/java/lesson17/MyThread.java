package lesson17;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=1000; i< 1010; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

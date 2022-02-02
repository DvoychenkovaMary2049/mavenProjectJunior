package lesson17;

public class Pevets1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int round = 0;
        while (!needStop) {
            round++;
            if (round > 3) {
                needStop = true;
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("LA ----------------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();
            }
            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class OddThread extends Thread {
    private String threadName;

    public OddThread() {
    }

    public OddThread(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(this.threadName + " : " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread("oddNumber");
        EvenThread evenThread = new EvenThread("evenNumber");
        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}
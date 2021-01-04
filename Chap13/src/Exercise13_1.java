public class Exercise13_1 implements Runnable{
    public static void main(String[] args) {
        Thread t = new Thread(new Exercise13_1());
        t.start();
    }

    @Override
    public void run() {
        for(int i=0; i<300; i++) {
            System.out.print('-');
        }
    }
}

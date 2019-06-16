package Aufgabe_1;

public class CounterCommand implements Runnable {

        @Override
        public void run() {
                for(int i = 0; i < 10; i++) {
                        System.out.println(i);
                        try {
                                Thread.sleep(new java.util.Random().nextInt(1000));
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                                System.out.println(e.getMessage());
                        }
                }
        }
}

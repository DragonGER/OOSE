package Aufgabe_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataCommand implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
            try {
                Thread.sleep(new java.util.Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}


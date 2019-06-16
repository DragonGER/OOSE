package Aufgabe_2;

import java.io.File;

public class DateiBeobachter implements Runnable {

    private File file = null;

    public DateiBeobachter(String path) {
        this.file = new File(path);
    }

    public DateiBeobachter(File file) {
        this.file = file;
    }
    @Override
    public void run() {
        long lastModified = file.lastModified();
        while(true) {
            try {
                Thread.sleep(5*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(file.getName());
            if(lastModified != file.lastModified()) {
                System.out.println("File has been modified!");
                lastModified = file.lastModified();
            }
        }
    }
}

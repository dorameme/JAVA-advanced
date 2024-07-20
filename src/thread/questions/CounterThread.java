package thread.questions;

import static util.MyLogger.*;

import util.MyLogger;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            log(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

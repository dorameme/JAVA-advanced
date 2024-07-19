package thread.start;

import static util.MyLogger.*;

import util.MyLogger;

public class InnerRunnableMainV1 {//중첩

    public static void main(String[] args) {
        log("main start");
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        log("main end");
    }
    static class MyRunnable implements  Runnable{

        @Override
        public void run() {
            log("run()");
        }
    }
}

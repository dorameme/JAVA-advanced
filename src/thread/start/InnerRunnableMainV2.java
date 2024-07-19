package thread.start;

import static util.MyLogger.log;

import thread.start.InnerRunnableMainV1.MyRunnable;

public class InnerRunnableMainV2 {//익명

    public static void main(String[] args) {
        log("main start");
        Runnable myRunnable=new Runnable() {
            @Override
                public void run(){
                log("run()");
            }
        };
        Thread thread=new Thread(myRunnable);
        thread.start();
        log("main end");
    }
}

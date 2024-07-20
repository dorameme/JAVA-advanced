package thread.questions;

import static util.MyLogger.log;

public class ThreadQuestionMain2 {

    public static void main(String[] args) {
        Thread thread= new Thread(new CounterRunnable(), "counterRunner");
        thread.start();
    }
    static class CounterRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=1;i<=5;i++){
                log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

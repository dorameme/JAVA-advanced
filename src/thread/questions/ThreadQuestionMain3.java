package thread.questions;

import static util.MyLogger.log;

public class ThreadQuestionMain3 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "counterRunner");
        thread.start();
    }
}
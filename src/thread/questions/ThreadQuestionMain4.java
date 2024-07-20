package thread.questions;

import static util.MyLogger.log;

public class ThreadQuestionMain4 {

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                log("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "counterRunner");
        Thread threadB = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                log("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "counterRunner");
        threadA.start();
        threadB.start();
    }
}
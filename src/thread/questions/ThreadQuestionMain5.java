package thread.questions;

import static util.MyLogger.*;
import static util.MyLogger.log;

import util.MyLogger;

public class ThreadQuestionMain5 {

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "work-A");
        Thread threadB = new Thread(new PrintWork("B", 500), "work-B");
        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {

        String write;
        Long time;

        public PrintWork(String write, long time) {
            this.write = write;
            this.time = time;
        }

        @Override
        public void run() {
            while (true) {
                log(write);

                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
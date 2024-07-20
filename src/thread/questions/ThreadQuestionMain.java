package thread.questions;

public class ThreadQuestionMain {

    public static void main(String[] args) {
    CounterThread counterThread=new CounterThread();
    counterThread.start();
    }
}

package thread.start;

public class BadThreadMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        HelloThread helloThread =new HelloThread();
        helloThread.run();///main메서드가아닌 helloThread가 run을한다 main은 지시만 함.
        System.out.println(Thread.currentThread().getName());
    }
}

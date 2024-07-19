package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        HelloThread helloThread =new HelloThread();
        helloThread.start();///main메서드가아닌 helloThread가 run을한다 main은 지시만 함.
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }
}

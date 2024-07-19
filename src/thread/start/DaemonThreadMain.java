package thread.start;

public class DaemonThreadMain extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DaemonThread daemonThread=new DaemonThread();
        daemonThread.setDaemon(true);//-> 메인이 끝나면 그대로 끝난다.
        daemonThread.start();
        System.out.println(Thread.currentThread().getName());
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "run() end");
        }
    }
}
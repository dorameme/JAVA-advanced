package thread.start;

public class HelloThread extends Thread{
 @Override
    public void run(){
     System.out.println(HelloThread.currentThread()+"시작!");
 }
}

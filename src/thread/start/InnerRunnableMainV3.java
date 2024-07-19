package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {//익명

    public static void main(String[] args) {
        log("main start");
//        Thread thread=new Thread(new Runnable() {//option+command+n  변수 합침
//            @Override
//                public void run(){
//                log("run()");
//            }
//        });
        Thread thread=new Thread(()-> log("gogo"));//함수형 인터페이스에 람다 사용!
        thread.start();
        log("main end");
    }
}

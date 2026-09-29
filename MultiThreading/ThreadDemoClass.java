package MultiThreading;

public class ThreadDemoClass extends Thread{
    public void run(){
        for(int i = 0 ; i<=5 ; i++){
            System.out.println("child thread");
        }

    }
    public static void main(String[] args) {
        ThreadDemoClass t1 = new ThreadDemoClass();
        t1.start();
        for(int i = 0 ; i<=5 ; i++){
            System.out.println("main thread");
        }
    }

}

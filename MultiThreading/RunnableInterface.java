package MultiThreading;

public class RunnableInterface implements Runnable{
public void run(){
    for(int i = 0 ; i<=5 ; i++){
        System.out.println("child thread");
    }
}
    public static void main(String[] args){
        RunnableInterface di = new RunnableInterface();
        Thread t = new Thread(di);
        t.start();
       for(int i = 0 ; i<=5 ; i++){
            System.out.println("main thread");
        }
    
}
}

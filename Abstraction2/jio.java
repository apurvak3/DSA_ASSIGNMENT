package Abstraction2;

public class jio extends vivo {
    void sendSms(){
        System.out.println("This is a specific functionality of jio mobile");
    }
    public static void main(String[] args) {
        
        jio obj = new jio();
        obj.youtube();
        obj.sendSms();
    }

}

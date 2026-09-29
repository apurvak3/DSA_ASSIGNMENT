package Abstraction2;

public class Airtel extends vivo {
    void sendSms(){
        System.out.println("This is a specific functionality of Airtel mobile");
    }
    public static void main(String[] args) {
        
        Airtel obj = new Airtel();
        obj.youtube();
        obj.sendSms();
    }

}

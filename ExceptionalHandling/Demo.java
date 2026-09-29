public class Demo {
public void m1() throws InterruptedException{
    Thread.sleep(50000);
}
public void m2() throws InterruptedException{
    this.m1();

}
public void m3() throws InterruptedException{
    this.m2();
}
public static void main(String[] args) throws InterruptedException{
    Demo d = new Demo();
    d.m3();
}
}

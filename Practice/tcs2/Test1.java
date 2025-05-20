package tcs2;
class Test2 extends Thread{
	public void run() {
		System.out.println("Good morning");
	}
}
class Test3 implements Runnable{
	public void run() {
		System.out.println("hello");
	}
}
public class Test1 {
	public static void main(String[] args) {
        Test2 t=new Test2();
        Test3 t1=new Test3();
        t.start();
        Thread t3=new Thread(t1);
        t3.start();
	}
}

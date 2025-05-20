package tcs2;
class Test01 extends Thread{
	public void run() {
	System.out.println("hi");
}
	}
class Test2 extends Test01{
	public void run() {
		System.out.println("Hello");
	}
}
class Test3 implements Runnable{
	public void run() {
		System.out.println("good");
	}
}
public class Test4 extends Test3{
	public void run() {
		System.out.println("bad");
	}
}
public class Test{
	public static void main(String[] args) {
		Test01 t=new Test01();
		Test2 t1=new Test2();
		Test3 t2=new Test3();
		Test4 t4=new Test4();
		t.start();
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();
		Thread t5=new Thread(t4);
		t5.start();
	}
}

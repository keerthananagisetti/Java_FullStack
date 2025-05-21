package examples;
interface In1{
	void run();
}
interface In2{
	void walk();
}
class Sample implements In2{
	public void run(){
		System.out.println("running");
	}
	public void walk() {
		System.out.println("walking");
	}
	public void sing() {
		System.out.println("singing");
	}
}
public class Ex2 implements In2 {
	public void run(){
		System.out.println("running");
	}
	public void walk() {
		System.out.println("walking");
	}
	public void dance() {
		System.out.println("dancing");
	}
	public static void main(String[] args) {
		Ex2 e1=new Ex2();
		Sample s1=new Sample();
          e1.run();
          e1.walk();
          e1.dance();
          s1.sing();
	}
}

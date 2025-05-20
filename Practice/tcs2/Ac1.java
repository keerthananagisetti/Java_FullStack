package tcs2;
class Demo1{
	void show() {
		System.out.println("never");
	}
}
public class Ac1 {
	Demo1 d=new Demo1(){
	 void show() {
		 System.out.println("Ever");
		 super.show();
	 }
	};
	public static void main(String[] args) {
	    Ac1 a=new Ac1();
	    a.d.show();
	}
}

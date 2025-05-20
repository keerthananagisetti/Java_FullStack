package tcs;

public class Sample1 {
	int d=6;
	static int a=6,b=8;
	void cir() {
		System.out.println(3.14*a*a);
		System.out.println(d*d);
	}
	static void rec() { 
		int e=6,f=8;
		System.out.println(a*b);
		System.out.println(0.5*e*f);
	}
  

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.cir();
		rec();
	}

}

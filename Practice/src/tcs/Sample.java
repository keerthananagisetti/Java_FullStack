package tcs;

public class Sample {
	int a=10,b=20;
	static int c=30,d=40;
	void mod() {
		System.out.println(a%b);
	}
	void div()
	{
		int e=60,f=80;
		System.out.println(e/f);
	}
	public static void main(String[] args) {
		Sample t1=new Sample();
		System.out.println(Sample.c*Sample.d);
		t1.mod();
		t1.div();

	}

}

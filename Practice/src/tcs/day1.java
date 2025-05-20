package tcs;

public class day1 {
	int a=10,b=20;
	static int c=20,d=30;
	void and()
	{
		System.out.println((a>b)&&(a<=b));
	}
	void or(){
		System.out.println((c>d)||(c>=d));
	}
	void not(){
		int e=60,f=50;
		System.out.println(!(e<f));
	}
	public static void main(String[] args) {
		day1 d=new day1();
		d.and();
		d.or();
		d.not();
	}

}

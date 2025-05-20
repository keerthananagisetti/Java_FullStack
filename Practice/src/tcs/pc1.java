package tcs;
public class pc1 {
	int a;
	int b;
	public pc1(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
	   pc1 c=new pc1(30,40);
	   c.add();
	}
}

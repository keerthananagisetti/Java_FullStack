package tcs;

public class cc {
	int x;
	int y;
	public cc(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public cc(cc c1){
		this.x=c1.x;
		this.y=c1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
      cc c1=new cc(66,78);
      cc c2=new cc(c1);
	}
}

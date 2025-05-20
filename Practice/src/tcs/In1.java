package tcs;
interface I1{
	void add();
	void sub();
}
public class In1 implements I1{
	public void add() {
		System.out.println("hi");
	}
    public void sub() {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		In1 i=new In1();
		i.add();
		i.sub();
	}
}

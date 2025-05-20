package tcs;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3 extends I1,I2{
	void mul();
}
public class iex1 implements I3{
	public void add() {
		System.out.println("hey");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("world");
	}
	public void div() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		iex1 i=new iex1();
		i.add();
		i.sub();
        i.mul();
        i.div();
	}

}

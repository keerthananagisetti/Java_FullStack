package examples; 
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3{
	void mul();
}
public class Ex1 implements I3 {
	public void add() {
		System.out.println("adding");
	}
	public void sub() {
		System.out.println("subtracting");
	}
	public void mul() {
		System.out.println("multiplying");
	}
	public void div() {
		System.out.println("dividing");
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		e.add();
		e.sub();
		e.mul();
		e.div();
	}
}

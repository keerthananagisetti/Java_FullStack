package examples;
interface I1{
	void sum();
}
interface I2{
	void swim();
}
interface I3{
	void paint();
}
public class Ex4 implements I1,I2,I3{
	public void sum() {
		System.out.println("summation");
	}
	public void swim() {
		System.out.println("swiming");
	}
	public void paint() {
		System.out.println("painting");
	}
	public void draw() {
		System.out.println("drawing");
	}
	public static void main(String[] args) {
		Ex4 e1=new Ex4();
         e1.sum();
         e1.swim();
         e1.paint();
         e1.draw();
	}
}

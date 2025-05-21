package examples;
interface I1{
	void sit();
}
interface I2{
	void stand();
}
interface I3{
	void dance();
}
class paint implements I1,I2,I3{
	public void sit() {
		System.out.println("sitting");
	}
	public void stand() {
		System.out.println("standing");
	}
	public void dance() {
		System.out.println("dancing");
	}
	public void draw() {
		System.out.println("drawing");
	}
}
public class Ex5 extends paint{
	public void picture() {
		System.out.println("photograpy");
	}
	public static void main(String[] args) {
		Ex5 g1=new Ex5();
		g1.sit();
		g1.stand();
		g1.dance();
		g1.draw();
		g1.picture();
	}
}

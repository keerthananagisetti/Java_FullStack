package examples;
interface I1{
	void lily();
}
class Rose{
	 public void colour(){
		 System.out.println("red");
	 }
}
class flower extends Rose implements I1{
	public void lily() {
		System.out.println("lilies");
	}	
	public void sunflower() {
		System.out.println("sunflowering");
	}
}
public class Ex3 extends flower{
	public void price() {
		System.out.println("rs-100");
	}
	public static void main(String[] args) {
		Ex3 d1 =new Ex3();
		d1.colour();
		d1.lily();
		d1.sunflower();
		d1.price();
	}
}

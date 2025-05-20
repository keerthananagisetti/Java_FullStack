package tcs;
class bike{
	void speed() {
		System.out.println("250km per hour");
	}
}
class bmw extends bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends bmw{
	void price() {
		System.out.println("30 lakhs");
	}
}
public class multile {
	public static void main(String[] args) {
		model d=new model();
		d.price();
		d.rev();
		d.speed();
	}
}

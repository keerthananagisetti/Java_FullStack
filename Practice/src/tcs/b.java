package tcs;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class withdrawal{
	abstract void withdraw(int amount);
}
public class b extends withdrawal {
	FixedAmount f1=new FixedAmount();
	void withdraw(int amount) {
		f1.fixedamount-=amount;
		System.out.println("withdraw:"+amount);
		System.out.println("Available balance:"+f1.fixedamount);
	}
	public static void main(String[] args) {
	   int amount=Integer.parseInt(args[0]);
	   b d=new b();
	   d.withdraw(amount);
	}

}

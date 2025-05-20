package tcs;
class flowers{
	void rose() {
		System.out.println("red");
	}
}
class tulip extends flowers{
	void colour() {
		System.out.println("white");
	}
}
class lily extends tulip{
	void price() {
		System.out.println("rs-100");
	}
}
class cauliflower extends tulip{
	void vegetable() {
		System.out.println("health");
	}
}
public class hyb {
	public static void main(String[] args) {
		lily l=new lily();
		cauliflower c=new cauliflower();
		l.rose();
		l.colour();
		c.rose();
		c.colour();
		l.price();
		c.vegetable();
	}
}

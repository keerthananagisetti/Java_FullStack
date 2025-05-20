package tcs;
class fruits{
	void benefits() {
		System.out.println("health");
	}
}
class apple extends fruits{
	void colour() {
		System.out.println("red");
	}
}
class mango extends fruits{
	void price() {
		System.out.println("rs-100 per kg");
	}
}
class banana extends fruits{
	void taste() {
		System.out.println("sweet");
	}
}
public class mulpa {
	public static void main(String[] args) {
		apple a=new apple();
		mango m=new mango();
		banana b=new banana();
           a.benefits();
           a.colour();
           m.price();
           b.taste();
           b.benefits();
           
	}

}

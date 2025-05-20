package tcs;
class chocolate{
	void colour() {
		System.out.println("brown");
	}
}
class darkfantasy extends chocolate{
	void price() {
		System.out.println("50");
	}
}
class sweet extends chocolate{
	void taste1() {
		System.out.println("chocolaty");
	}
}
class bournvelli extends darkfantasy{
	void cost1() {
		System.out.println("60");
	}
}
class amul extends darkfantasy{
	void cost2() {
		System.out.println("90");
	}
}
class dairymilk extends sweet{
	void weight1() {
		System.out.println("100gm");
	}
}
class kitkat extends sweet{
	void weight2() {
		System.out.println("150gm");
	}
}
public class hierar {
	public static void main(String[] args) {
        bournvelli b=new bournvelli();
        amul a=new amul();
        dairymilk d=new dairymilk();
        kitkat k=new kitkat();
        b.price();
        b.cost1();
        
        
	}

}

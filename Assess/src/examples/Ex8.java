package examples;
interface I1{
	void sun();
}
interface I2{
	void rain();
}
interface I3{
	void sky();
}
interface I4 extends I1,I2,I3{
	void snow();
}
public class Ex8 implements I4{
	public void sun(){
		System.out.println("sunny");
	}
	public void rain() {
		System.out.println("rainning");
	}
    public void sky() {
    	System.out.println("clear");
    }
    public void snow() {
    	System.out.println("snowing");
    }
    public void climate() {
    	System.out.println("great");
    }
	public static void main(String[] args) {
		Ex8 r=new Ex8();
          r.sun();
          r.rain();
          r.sky();
          r.snow();
          r.climate();
	}
}

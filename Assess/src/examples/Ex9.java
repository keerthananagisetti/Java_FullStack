package examples;
interface I1{
	void trip();
}
interface I2{
	void tour();
}
interface I3{
	void art();
}
interface I4{
	void paint();
}
class Sample1 implements I1,I2,I3{
	public void trip() {
		System.out.println("visiting");
	}
	public void tour() {
		System.out.println("touring");
	}
	public void art() {
		System.out.println("artist");
	}
	public void music() {
		System.out.println("listening");
	}
}
public class Ex9 extends Sample1 implements I4{
	public void paint() {
		System.out.println("painting");
	}
    public void weather() {
    	System.out.println("cool");
    }
	public static void main(String[] args) {
		Ex9 t=new Ex9();
        t.trip();
        t.tour();
        t.art();
        t.music();
        t.paint();
        t.weather();
	}
}

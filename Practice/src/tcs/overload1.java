package tcs;
public class overload1 {
 void show() {
	 System.out.println("Good Morning");
 }
 void show(int a,int b) {
	 System.out.println(a+b);
 }
 void show(double d1,double d2) {
	 System.out.println(d1-d2);
 }
 void show(String s1,String s2) {
	 System.out.println(s1+s2);
 }
	public static void main(String[] args) {
		overload1 o = new overload1();
		o.show();
		o.show(66, 5);
		o.show(8.9, 9.6);
		o.show("kee","rthi");

	}

}

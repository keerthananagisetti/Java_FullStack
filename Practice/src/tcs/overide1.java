package tcs;
class ov{
	void show() {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}
}
public class overide1 extends ov {
	void show() {
		System.out.println("hellooooooooooooooooooooooooooooooooooooooooooooooooooooo");
	}
	public static void main(String[] args) {
               overide1 o = new overide1();
               o.show();
}
}
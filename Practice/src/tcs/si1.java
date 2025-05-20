package tcs;
class animal{
	void sleep() {
		System.out.println("sleeping");
	}	
}
class dog extends animal{
	void bark() {
		System.out.println("barking");
	}
}
	public class si1 extends animal {
	public static void main(String[] args) {
		dog a=new dog();
		a.bark();
		a.sleep();

	}

}

package examples;
interface I1{
	void add();
}
class Sam1{
	void sub() {
		System.out.println("subtracting");
	}
}
class Sam2 extends Sam1 implements I1{
	public void add() {
		System.out.println("adding");
	}
	public void mul() {
		System.out.println("multiplying");
	}	
}
class Sam3{
     public void div() {
    	 System.out.println("dividing");
     }
}
public class Ex6 extends Sam3{
	public void mod() {
		System.out.println("moduling");
	}
	public static void main(String[] args) {
		Ex6 e1=new Ex6();
		Sam2 s1=new Sam2();
         e1.mod();
         e1.div();
         s1.sub();
         s1.add();
         s1.mul();
	}
}

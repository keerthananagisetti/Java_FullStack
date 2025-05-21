package examples;
class Test1{
	final void show() {
		System.out.println("hi");
	}
}
public class Final1 extends Test1{
     void show() {
    	 int a=60;
    	 System.out.println(a);
    	 a=80;
    	 System.out.println(a);  			 
     }	 
	public static void main(String[] args) {
		Final1 a=new Final1();
           a.show();
	}

}

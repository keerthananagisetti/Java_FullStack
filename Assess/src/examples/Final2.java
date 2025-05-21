package examples;

public class Final2 {
      void show() {
    	  System.out.println("hi");
      }
      class Test23{
    	  void print() {
    		  System.out.println("hello");
    	  }
      }
	public static void main(String[] args) {
	   Final2 f=new Final2();
	   f.show();
	   Final2.Test23 t=new Final2().new Test23();
	   t.print();
	}
}

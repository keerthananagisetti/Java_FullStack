package tcs2;

public class Funin implements Runnable {
   public void run() {
	   System.out.println("hi");
   }
	public static void main(String[] args) {
		Funin f=new Funin();
		//Funin f1=new Funin();
		Thread p1=new Thread(f);
		Thread p2=new Thread(f);
		System.out.println("hello");
               p1.start();
               p2.start();
	}

}

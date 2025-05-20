package tcs2;
public class Testi extends Thread{
      String s; 
    public Testi(String name) {
    	s=name;
    }
      public void run() {
    	  if(Thread.currentThread().isDaemon())
    	  {
    		  System.out.println(s +" is Daemon Thread");
    	  }
    	  else {
    		  System.out.println(s +" is user Thread");
    	  }
      }
	public static void main(String[] args) {
		Testi t1=new Testi("thread1");
		Testi t2=new Testi("thread1");
		Testi t3=new Testi("thread1");
            t1.setDaemon(true);
            t1.start();
            t2.start();
            t3.setDaemon(false);
            t3.start();
	}

}

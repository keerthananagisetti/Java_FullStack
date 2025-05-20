package tcs2;

public class Testy extends Thread {
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
				     e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Testy t5=new Testy();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
          t5.start();
	}

}

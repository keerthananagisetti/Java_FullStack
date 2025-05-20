package tcs2;
class Sample1 {
       private static void show() {
    	   System.out.println("Hi!");}
    	   static class Test26{
    	        static void print(){
    		   System.out.println("bye!");
    		   show();
    	   }
    	   }
}
public class Si1{
	public static void main(String[] args) {
		Sample1.Test26.print();
	}
}


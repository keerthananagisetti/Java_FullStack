
//iterator example
package tcs2;
import java.util.*;
public class javacursor1 {
	public static void main(String[] args) {
	 List<Integer>l1=new ArrayList<Integer>();
	 l1.add(56);
	 l1.add(45);
	 l1.add(88);
	 System.out.println(l1);
	 Iterator i1=l1.iterator();
	 while(i1.hasNext()) {
		 System.out.println(i1.next());
	 }
	 

	}

}

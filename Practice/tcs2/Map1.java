package tcs2;
import java.util.*;
public class Map1 {
	public static void main(String[] args) {
		Map<Integer,String>m1=new LinkedHashMap<Integer,String>();
		m1.put(1,"cse");
		m1.put(4,"civil");
		m1.put(5,"ds");
		m1.put(2,"ece");
		m1.put(6,"aiml");
		m1.put(3,"eee");
		System.out.println(m1);
		for(Map.Entry<Integer,String>i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}
}

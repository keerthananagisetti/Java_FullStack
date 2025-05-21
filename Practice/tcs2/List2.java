package tcs2;
import java.util.*;
public class List2 {
	public static void main(String[] args) {
		List<Object>l1=new ArrayList<Object>();
        l1.add(12);
        l1.add("hi");
        l1.add(67);
        l1.add(2,"hello");
        System.out.println(l1);
        List<Object>extra=Arrays.asList("keerthi","ganggg","kalyani","shahi"); 
        l1.addAll(1,extra);
        System.out.println(l1);
        System.out.println(l1.get(5));
        System.out.println(l1.indexOf("keerthi"));
        Object[] arr=l1.toArray();
        for(Object a1:arr) {
        	System.out.println(a1);
        }
	}
}

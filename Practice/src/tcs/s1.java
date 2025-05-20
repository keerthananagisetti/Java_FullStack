package tcs;

public class s1 {

	public static void main(String[] args) {
		String p1="queensss";
		String p2="queen";
		String p3=new String("queen");
		String p4=new String("queen");
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
		System.out.println(p3.equals(p4));
		System.out.println(p3==p4);
		System.out.println(p1.equals(p3));
		System.out.println(p1==p4);
		System.out.println(p1.compareTo(p4));
		
		

	}

}

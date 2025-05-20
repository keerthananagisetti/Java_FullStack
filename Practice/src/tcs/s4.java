package tcs;

public class s4 {

	public static void main(String[] args) {
		String str="helloworld";
		int c=0;
		char targetchar='l';
		for(int i=1;i<str.length();i++) 
			if(str.charAt(i)==targetchar) {
				c++;
			}
			System.out.println(c);
				
		}

	}



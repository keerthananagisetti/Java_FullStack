package tcs2;
import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException  {
		File f1=new File("C:\\Users\\Nagisetti Keerthana\\OneDrive\\Desktop\\kkk");
		if(f1.createNewFile()) {
			System.out.println("created succesfully");
		}else {
			System.out.println("path not correct");
		}

	}

}

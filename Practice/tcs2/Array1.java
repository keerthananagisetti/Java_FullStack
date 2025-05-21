package tcs2;
import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		int[] arr1= {67,72,34,66,90,89,21};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 89);
         System.out.println(a);
         for(int b1:arr1)
        	 System.out.println(b1);
         System.out.println();
	}
}

package tcs2;
import java.util.*;
public class Queue1 {
	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<Integer>();
          q1.add(45);
          q1.offer(34);
          q1.offer(47);
          q1.offer(88);
          q1.offer(100);
          System.out.println(q1);
          q1.poll();
          System.out.println(q1);
          q1.remove();
          System.out.println(q1);
	}
}

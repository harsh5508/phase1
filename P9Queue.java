package phase1programs_3;

import java.util.LinkedList;
import java.util.Queue;

public class P9Queue {

	public static void main(String[] args){
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < 8; i++)
			q.add(i);

		System.out.println("Elements of queue - " + q);

		// remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element - " + removedele);

		System.out.println(q);

		//view the head of queue
		int head = q.peek();
		System.out.println("head of queue - "	+ head);
	}
}

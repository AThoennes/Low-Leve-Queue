/**
 * @author Alex Thoennes
 * 
 * CMPS 240 
 * 
 * Dr. Bishop
 *
 */
public class MyQueue
{
	public static void main(String [] args)
	{
		Queue q = new Queue();
		
		q.enqueue(2);
		q.enqueue(1);
		q.dumpQueue();
		q.enqueue(3);
		q.enqueue(10);
		q.dequeue();
		q.enqueue(15);
		q.dumpQueue();
		q.dequeue();
		q.dequeue();
		q.dumpQueue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dumpQueue();
	}
}

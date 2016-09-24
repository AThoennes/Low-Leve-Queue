public interface QueueInterface <E>
{
	public void enqueue(E num);

	public E dequeue();
	
	public void dumpQueue();
}

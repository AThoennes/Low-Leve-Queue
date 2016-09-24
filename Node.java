public class Node <E>
{
	public E value;
	public Node<E> next;
	
	public Node(E num)
	{
		this.value = num;
		this.next = null;
	}
} 
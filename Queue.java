public class Queue<E> implements QueueInterface<E>
{
	int size; // size of the queue
	Node<E> head; // used to reference the very front of the queue
	Node<E> current; // used to keep track of the last element put into the queue

	/**
	 * constructor for the queue class that sets everything to their default value
	 */
	public Queue()
	{
		this.size = 0;
		this.head = null;
		this.current = null;
	}

	/**
	 * inserts num into the queue
	 * @param num
	 */
	public void enqueue(E num)
	{
		if (size == 0)
		{
			size ++; // increase size
			head = new Node<E>(num); // create new node
			current = head; // assign current to head
			head.next = null; // nothing after the first node
			System.out.println("Enqueued: " + num);
		}
		else
		{	
			if (size == 1)
			{
				head.next = new Node<E>(num);
				current = head.next;
			}
			else if (size > 1)
			{
				current.next = new Node<E>(num);
				current = current.next;
			}
			System.out.println("Enqueued: " + num);
			size ++;
		}
	}

	/**
	 * removes the head of the queue and reassigns the head to the next in line element
	 * @return node
	 */
	public E dequeue()
	{
		Node<E> temp = this.head;

		if (temp != null)
		{
			System.out.println("Dequeued: " + temp.value);
		}

		if (size == 0)
		{
			System.out.println("ERROR: NoSuchElementException! There must be something in the queue to dequeue.");
		}
		else
		{
			size --; // decrease the size
			this.head = head.next;
		}
		return (E) temp;
	}

	/**
	 * displays elements in the queue
	 */
	public void dumpQueue()
	{
		Node<E> n = head;
		
		System.out.print("Elements in queue: " );
		
		while (n != null)
		{
			System.out.print(n.value + "\t");
			n = n.next;
		}

		System.out.println("\n");
	}
}

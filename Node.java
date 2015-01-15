
public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this(data, null);
	}
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	/*
	 * Returns true if other is equal to this Node.
	 */
	public boolean equals(Node<T> other) {
		return this.compareTo(other) == 0;
	}
	
	/*
	 * Returns the data type T.
	 */
	public T getData() {
		return this.data;
	}
	
	/*
	 * Returns the node pointed to by next.
	 */
	public Node<T> getNext() {
		return this.next;
	}
	
	/*
	 * Sets the node pointed to by next.
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(Node<T> other) {
		return this.data.compareTo(other.getData());
	}
}
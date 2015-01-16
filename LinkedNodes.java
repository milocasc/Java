
public class LinkedNodes<T extends Comparable<T>> {
	private Node<T> front;
	
	public LinkedNodes() {
		this(null);
	}
	
	public LinkedNodes(Node<T> front) {
		this.front = front;
	}
	
	/*
	 * Adds a node to the end of the linked chain.
	 */
	public void add(Node<T> node) {
		if (front == null) {
			// Case where node is added to the front
			front = node;
		} else {
			Node<T> current = front;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(node);
		}
	}
	
	/*
	 * Removes a target node from the linked chain.
	 */
	public void remove(Node<T> target) {
		if (front != null) {
			if (front.equals(target)) {
				front = front.getNext();
			} else {
				Node<T> current = front;
				while (current.getNext() != null && !current.getNext().equals(target)) {
					current = current.getNext();
				}
				
				if (current.getNext() != null) {
					current.setNext(current.getNext().getNext());
				}
			}
		}
	}
	
	/*
	 * Reverses the ordering of nodes in the linked chain.
	 */
	public void reverse() {
		Node<T> current = front;
		Node<T> temp = null;
		
		while (current != null) {
			Node<T> temp2 = current.getNext();
			current.setNext(temp);
			temp = current;
			current = temp2;
		}
		
		this.front = temp;
	}
	
	/*
	 * Returns a String representation of nodes in the linked chain.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("front -> ");
		
		Node<T> current = front;
		while (current != null) {
			sb.append(current.getData().toString() + " -> ");
			current = current.getNext();
		}
		
		sb.append("null");
		return sb.toString();
	}
}

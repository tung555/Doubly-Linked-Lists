/**
 * Represents a generic Doubly Linked List object which the 
 * internal structure is linked list.
 * 
 * @author Chihyuan Tung
 *
 * @param <T> any type that extends from Comparable interface
 */
public class DoublyLinkedList<T extends Comparable<T>> {
	
	private NodeType<T> head;
	private NodeType<T> tail;
	private int length;
	
	/**
	 * The constructor of the class
	 */
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	/**
	 * A helper method takes in the index and returns the 
	 * node object at that index in a linked list.
	 * 
	 * @param n the head node of the linked list
	 * @param index the index number 
	 * @return the node at the specified index
	 */
	private NodeType<T> getNode(NodeType<T> n, int index) {
		for (int i = 0; i < index; ++i) {
			n = n.getNext();
		}
		return n;
	}
	
	/**
	 * Inserts {@code item} into the list at appropriate position 
	 * which make the entire list in ascending order.
	 * 
	 * @param item the item to be inserted
	 */
	public void insertItem(T item) {
		if (this.length == 0) {
			this.head = new NodeType<T>(item);
			this.tail = this.head;
			this.length += 1;
			return;
		}
		
		NodeType<T> temp = this.head;
		for (int i = 0; temp != null; ++i) {
			if (temp.info.compareTo(item) > 0) {
				if (i == 0) {
					this.head = new NodeType<T>(item, temp, null);
					this.head.getNext().setBack(this.head);
					this.length += 1;
					return;
				}
				NodeType<T> n = getNode(this.head, i-1);
				n.setNext(new NodeType<T>(item, temp, n));
				temp.setBack(n.getNext());
				this.length += 1;
				return;
			} else if (temp.info.compareTo(item) == 0) {
				System.out.println("Item already exists");
				return;
			}
			temp = temp.getNext();
		}
		getNode(this.head, this.length-1).setNext(new NodeType<T>(item, null, this.tail));
		this.tail = this.tail.getNext();
		this.length += 1;
		return;
	}
	
	/**
	 * Deletes a specific item from the list if presented.
	 * 
	 * @param item the item to be deleted
	 */
	public void deleteItem(T item) {
		if (this.length() == 0) {
			System.out.println("You cannot delete from an empty list");
			return;
		} else if (this.length() == 1 && this.head.getInfo().equals(item)) {
			this.head = null;
			this.tail = null;
			this.length -= 1;
			return;
		} else if (this.head.getInfo().equals(item)) {
			this.head = this.head.getNext();
			this.head.setBack(null);
			this.length -= 1;
			return;
		}
		
		NodeType<T> temp = this.head;
		boolean done = false;
		for (int i = 0; temp != null; ++i) {
			if (temp.getInfo().equals(item)) {
				if (temp.equals(this.tail)) {
					this.tail = this.tail.getBack();
					this.tail.setNext(null);
					this.length -= 1;
					return;
				}
				NodeType<T> n = getNode(this.head, i-1);
				n.setNext(temp.getNext());
				n.getNext().setBack(n);
				this.length -= 1;
				return;
			}
			temp = temp.getNext();
		}
		if (!done) {
			System.out.println("The item is not present in the list");
		}
	}
	
	/**
	 * Returns the length of the list.
	 * 
	 * @return the length of the list
	 */
	public int length() {
		return this.length;
	}
	
	/**
	 * Prints the list.
	 * 
	 * @return a string which is the content of the list
	 */
	public String print() {
		String list = "";
		NodeType<T> temp = this.head;
		while (temp != null) {
			list += temp.getInfo() + " ";
			temp = temp.getNext();
		}
		list += "\n";
		return list;
	}
	
	/**
	 * Prints the list from the back.
	 * 
	 * @return a string which is the reverse of the list
	 */
	public String printReverse() {
		String list = "";
		NodeType<T> temp = this.tail;
		while (temp != null) {
			list += temp.getInfo().toString() + " ";
			temp = temp.getBack();
		}
		list += "\n";
		return list;
	}
	
	/**
	 * Deletes all the element within {@code upper} and 
	 * {@code lower} from the list.
	 * 
	 * @param upper the upper bound of the range
	 * @param lower the lower bound of the range
	 */
	public void deleteSubsection(T upper, T lower) {
		NodeType<T> temp = this.head;
		while (temp != null) {
			if (temp.getInfo().compareTo(lower) >= 0 
					&& temp.getInfo().compareTo(upper) <= 0) {
				this.deleteItem(temp.getInfo());
			}
			temp = temp.getNext();
		}
	}
	
	/**
	 * Reverses the list by swapping the values in the list.
	 */
	public void reverseList() {
		if (this.length > 0) {
			NodeType<T> tempH = this.head, tempT = this.tail;
			for (int i = 0; i <= length / 2; ++i) {
				T tempVal = tempH.getInfo();
				tempH.setInfo(tempT.getInfo());
				tempT.setInfo(tempVal);
				tempH = tempH.getNext();
				tempT = tempT.getBack();
			}
		}
	}
	
	/**
	 * Swaps the value at position 1 and 2, 3 and 4...... 
	 * so on and so for.
	 */
	public void swapAlternate() {
		NodeType<T> temp = this.head;
		T tempVal;
		
		if (this.length == 0 || this.length == 1) {
			return;
		}
		
		if (this.length % 2 == 0) {
			while (temp != null) {
				tempVal = temp.getInfo();
				temp.setInfo(temp.getNext().getInfo());
				temp.getNext().setInfo(tempVal);
				temp = temp.getNext().getNext();
			}
		} else {
			while (temp.getNext() != null) {
				tempVal = temp.getInfo();
				temp.setInfo(temp.getNext().getInfo());
				temp.getNext().setInfo(tempVal);
				temp = temp.getNext().getNext();
			}
		}
	}
	
}

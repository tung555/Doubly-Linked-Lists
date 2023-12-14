
/**
 * Represents a node object which contains {@code T} type values.
 * 
 * @author Chihyuan Tung
 *
 * @param <T> any type that extends Comparable interface
 */
public class NodeType<T extends Comparable<T>> {
	
	public T info;
	public NodeType<T> next;
	public NodeType<T> back;
	
	/**
	 * Constructor of the class.
	 * 
	 * @param info is the object to initialize info
	 */
	public NodeType(T info) {
		this.info = info;
		this.next = null;
		this.back = null;
	}
	
	/**
	 * Constructor of the class.
	 * 
	 * @param info is the object to initialize info
	 * @param next is the node object to initialize next 
	 * @param back is the node object to initialize back
	 */
	public NodeType(T info, NodeType<T> next, NodeType<T> back) {
		this.info = info;
		this.next = next;
		this.back = back;
	}
	
	/**
	 * Returns next
	 * @return next
	 */
	NodeType<T> getNext() {
		return this.next;
	}
	
	/**
	 * Returns back
	 * @return back
	 */
	NodeType<T> getBack() {
		return this.back;
	}
	
	/**
	 * Initializes or modifies next with {@code next}.
	 * 
	 * @param next the object to initialize or modifies next
	 */
	void setNext(NodeType<T> next) {
		this.next = next;
	}
	
	/**
	 * Initializes or modifies back with {@code back}.
	 * 
	 * @param back the object to initialize or modifies back
	 */
	void setBack(NodeType<T> back) {
		this.back = back;
	}
	
	/**
	 * Returns info
	 * 
	 * @return info
	 */
	T getInfo() {
		return this.info;
	}
	
	/**
	 * Initializes of modifies info.
	 * 
	 * @param info the object to initializes or modifies info
	 */
	void setInfo(T info) {
		this.info = info;
	}
}

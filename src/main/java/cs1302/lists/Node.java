
public class Node<T> {
public T data; //the object 
public Node<T> next;//used for linkedlist and doubly linked list
public Node<T> prev;//can only be used for doublylinked list

public Node() {
	
	
}
public Node(T data)  {//constructor for linkedlist, however this proved to be the wrong choice and was later discarded
	this.data = data;
	this.next = null;

	
}
public Node(T data, Node<T> next) {//never used.  
	this.next = next;
	this.data = data;
}

}


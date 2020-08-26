

public class LinkedList<T extends Comparable<T>> implements List<T> { //working linked list!
private Node<T> head; // = first / 0th index
private Node<T> tail;
private int initalSize;
private int size;
public LinkedList(int initalSize) {
	this.size = initalSize;

}
public LinkedList() {
	this.size = 0;

}


	@Override
	public void append(T elem) {
		if (head != null) {
			  if (tail == null) {
			      throw new RuntimeException ("invalid call to addAtEnd, tail is null");
			    }
			    Node<T> newNode = new Node<T>(elem);
			    tail.next = newNode;
			    tail = newNode;
		    } else {
		    	   head = new Node<T>(elem, head);
		    	    if (tail == null) {
		    	      tail = head;
		    	    }
		    }
		    size++;
	
	}

	@Override
	public void prepend(T elem) {
	add(0, elem); //the add function takes care of index at 0//prepending
		    }
		
	

	@Override
	public void add(int index, T elem) throws IndexOutOfBoundsException {
		if ((index < 0) || (index > size)) {
		      throw new IndexOutOfBoundsException();
		    }
		    if (index == 0) {
		    	  head = new Node<T>(elem, head);
		    	    if (tail == null) {
		    	      tail = head;
		    	    }
		    } else {
		    	Node<T> prev = nodeAtPosition (index - 1);
		        Node<T> newNode = new Node<T>( elem, nodeAtPosition (index - 1));
		        prev.next = newNode;
		        if (prev == tail) {  // if added at end, update tail value
		          tail = newNode;
		        }
		     
		    }
		    size++;
    }
	 private Node<T> nodeAtPosition(int index) {
		   // verify (index >= 0);
		    Node<T> result = head;
		    while (index > 0) {
		      result = result.next;
		      index--;
		    }
		    if (result != null);
		    return result;
		  }

		
	

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		 if (head == null) throw new IndexOutOfBoundsException();

	      Node<T> temp = head;
	      for (int k = 0; k < index; k++)
	    	  temp = temp.next;

	    //  if( temp == null) throw new IndexOutOfBoundsException();

	      return temp.data; 
		
	}

    public void remove(int index) {
    	
    	if ( index > size)
			throw new IndexOutOfBoundsException();
    
 index--;
		Node<T> current = head;
		
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.next == null)
					throw new IndexOutOfBoundsException();
 
				current = current.next;
			}
			current.next = current.next.next;
 
			// decrement the number of elements variable
			size--;
		
 
		}
		
    	
    }

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		
		if(hi > size || lo < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> current = head;
		for(int i = lo; i <= hi; i++) {
			
			if(s.compareTo(current.data) == 1) {
				return i;
			}
			current = current.next;
			
			
		}
		
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public  String toString() { //for type person
		String temp = "";
	for(int i = 0; i < size; i++){
		Person person = (Person)get(i);
		temp+=  person.getName();
		temp+= ";  ";
		if(i % 10 == 0 && i != 0) {
			temp+= "\n";
			
		}
	}
	return  temp;
	}

}

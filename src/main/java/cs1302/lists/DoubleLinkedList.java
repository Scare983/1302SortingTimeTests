
public class DoubleLinkedList <T extends Comparable<T>> implements List<T>{
	private Node<T> head;
	private Node<T> tail;
	private int size, initialSize;
	DoubleLinkedList() {
		size = 0;
		
	}
	public DoubleLinkedList(int size) { //size changes when removing or adding
	this.size = size;
	}
	
	@Override
	public void append(T elem) {
		// TODO Auto-generated method stub
	      Node<T> help = new Node<T>(elem);
	        if(size==0){ //no elements, head and tail are the same and are added
	            head = help;
	            tail = help;
	        }else{ //the last index is equal to the newly inputed location.
	            tail.next = help;
	            help.prev = tail;
	            tail =help;
	        }
	        size++;
	      
	}

	@Override
	public void prepend(T elem) {
		// TODO Auto-generated method stub
		if(isEmpty()) {//if no nodes are here, head and tail are the same and element is added.
			head = tail = new Node<>(elem);
			size++;
		} else if(head == tail) {//if there is only 1 element, then do this
			T temp = head.data;
			head = new Node<>(elem);
			tail = new Node<>(temp);
			head.next = tail;
			tail.prev = head;
			head.prev = tail;
			tail.next = head;
			size++;
		} else {//else
			Node<T> temp = new Node<T>(elem);
			tail.next = temp;
			temp.prev = tail;
			head.prev = temp;
			temp.next = head;
			head = temp;
			size++;
		}
	}

	@Override
	public void add(int index, T elem) throws IndexOutOfBoundsException {
		
		if(index == 0) { //if adding at 0, you are prepending, let prepend handle it
			prepend(elem);
		} else if(index == size()) {//if size is same, let appened handle it.
			append(elem);
		} else {
			Node<T> m = new Node<T>(elem);
			Node<T> item = head;
			for(int i = 1; i <= size(); i++) {//i has to be one, we already checked for index 0.
				if(i == index) {//if we find the location, change the links so prev.next = new, new.prev = prev, new.nxt = next. 
					Node<T> temp = item.next;
					item.next = m;
					m.prev = item;
					m.next = temp;
					temp.prev = m;
					size++;
				}
				item = item.next;
			}
		}
	  
	}

		
	

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
	
	 
			if(head == null) {//there are no elements
				return null;
			} 
			else if(head == tail) {
				if(index != 0)
					return null;
				//else
				return head.data;
			} 
			else {
				if(index == size()-1)
					return tail.data;
				if(index == 0)
					return head.data;
				int s = 1;
				Node<T> temp = head;
				do {
					if(s-1 == index)
						return temp.data;
					s++;
					temp = temp.next;
				} while(temp != tail);
			}
			return null;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException { //with bigO in mind, we dont have to use a for loop
		// TODO Auto-generated method stub
	
		  

		    if(index==0){
		        if(size==1){//only 1 element, those elements are now null.
		           
		            head = null;
		            tail = null;
		        }
		        else{
		         
		            head = head.next;
		            head.prev = null;//the new heads prev is now null because we are shifting "left"
		        }
		    }
		    else if(index+1==size){//i had problems with size, this is just worked in the end.
		    
		        tail = tail.prev;
		        tail.next = null;
		    }
	
		    else{
		        Node<T> current = head;
		        int i=0;
		     
		        while(current!=null){ 
		            if(i==index){
		                Node<T> previous = current.prev;
		                Node<T> nextInLine = current.next;
		                previous.next = nextInLine;
		                nextInLine.prev = previous; //each node looks the before and after
		               
		                break;
		             
		            }
		            current = current.next;
		            i++;
		        }
		    }   
		    size--;
	   
	}

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {//basically just running through each data and using the compare method.
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
	public boolean isEmpty() {
		return head == null;
	}

}

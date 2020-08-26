
public class ArrayList<T extends Comparable<T>> implements List<T> {

	@SuppressWarnings("unchecked")
	private T[] array;
	private int size = 0;
	
	ArrayList(int size) {
		this.size = size;
		array =  (T[]) new Comparable[size];

		
		
	
	}
	
	ArrayList() {
	size = 0;
		
		
	
	}
	
	
	
	
	
	
	@Override
	public void append(T elem) {
		size++;
		// create a temporary array
		@SuppressWarnings("unchecked")
		
		T[] tmp = (T[]) new Comparable[size];
		
		// copy elements from the original array into the temp array
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		} // for
		
		// add the element to the last position in the temp array
		tmp[tmp.length - 1] = elem;
	

		// replace the array with the temp array
		array = tmp;
		
	} // append

	@Override
	public void add(int index, T elem) throws IndexOutOfBoundsException {
	//dont add to size
		if(index > size) {
		throw new IndexOutOfBoundsException();
		
	}
	T[] temp = (T[]) new Comparable[size + 1];
	for(int i = 0; i < size+1; i++) {
		if(i == index)
			temp[i] = elem;
		else if(i < index)
			temp[i] = array[i];
		else
			temp[i] = array[i-1];
	}
array = temp;

		
		
	} // add
	public boolean isEmpty() {
		return size == 0;
		
		
	}









	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		if(isEmpty() || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		return array[idx];
	} // get

	@Override
	public void prepend(T elem) {
		size++;
		// create a temporary array
		@SuppressWarnings("unchecked")
		
		T[] tmp = (T[]) new Comparable[size];
		// add the element to the fist position in the temp array
		tmp[0] = elem;
		// copy elements from the original array into the temp array
		for (int i = 1; i < size; i++) {
			tmp[i] = array[i -1];
		} // for
		
		
		
	

		// replace the array with the temp array
		array = tmp;
	} // prepend

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
			if(isEmpty() || index >= size())
				throw new IndexOutOfBoundsException();
			else {
				size--;
				T[] temp = (T[]) new Comparable[size];
				for(int i = 0; i < size; i++) {
					if(i < index)
						temp[i] = array[i];
					else
						temp[i] = array[i+1];
					
				}
				array = temp;
				
				
				
			}
		
		
	} // remove

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		if(isEmpty()   )
			throw new IndexOutOfBoundsException();
	
		for(int i = lo; i <hi-1; i++) {
			if(s.compareTo(array[i]) > 0) {
				return i;
			}
			
		}
		
		return -1 ;
	} // search

	@Override
	public int size() {
		return size;
		
	} // size


@Override
	public  String toString() { 
		String temp = "";
	for(int i = 0; i < size(); i++){
		
		temp+= get(i) ;
		temp+= ";  ";
		if(i % 10 == 0 && i != 0) {
			temp+= "\n";
			
		}
	}
	return  temp;
	}
	
	
} // ArrayList

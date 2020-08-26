
public interface List<T extends Comparable<T>> {

    /**
     * Inserts this element at the end of the list.
     * 
     * @param elem the element to be inserted.
     */
    public void append(T elem);

    /**
     * Inserts this element at the beginning of the list.
     * 
     * @param elem the element to be inserted.
     */
    public void prepend(T elem);

    /**
     * Inserts this element at specified index. If an element already exists at
     * the specified index then it is replaced by the new element. If the index
     * is out of bounds then an IndexOutOfBoundsException should be thrown.
     * 
     * @param idx the index where the element is to be inserted.
     * @param elem the element to be inserted.
     */
    public void add(int idx, T elem) throws IndexOutOfBoundsException;

    /**
     * Returns the element at the specified index. If the index
     * is out of bounds then an IndexOutOfBoundsException should be thrown.
     * 
     * @param elem the element to be inserted.
     */
    public T get(int idx) throws IndexOutOfBoundsException;

    /**
     * Removes the element at specified index. This will reduce the size of
     * the list by one element. If the index is out of bounds then an 
     * IndexOutOfBoundsException should be thrown.
     * 
     * @param idx the index of the element that is to be removed.
     */
    public void remove(int idx) throws IndexOutOfBoundsException;


    /**
     * Returns the index of the specified search element in the list if it
     * exists within the range. If the search element does not exist in the 
     * list then this method should return -1. A linear search implementation
     * is reccommended. If either or both the lower and upper bounds on the 
     * search space are out of bounds then an 
     * IndexOutOfBoundsException should be thrown.
     *
     * @param s the specified search element.
     * @param lo an index indicating the lower bound on the search space
     * @param hi an index indicating the upper bound on the search space
     * @return the index where the search element was found or -1.
     */
    public int search(T s, int lo, int hi) throws IndexOutOfBoundsException;

    /**
     * Returns the size of the list
     *
     * @return the size of the list
     */
    public int size();

} // List

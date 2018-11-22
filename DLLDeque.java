
public interface DLLDeque<E> {
	
	/**
	 * returns true if the list is empty
	 * @return true if list is empty, else false
	 */
	public boolean isEmpty();
	
	/**
	 * returns the size of the list
	 * @return size of list
	 */
	public int size();
	
	/**
	 * Adds element item to the front of the list
	 * @param item element to add to front of list
	 */
	public void addFirst(E item);
	
	/**
	 * Adds element item to end of list
	 * @param item element to add to end of list
	 */
	public void addLast(E item);
	
	/**
	 * removes and returns the first element of the list
	 * @return the element removed from the list
	 */
	public E removeFirst();
	
	/**
	 * Removes and returns the last element in the list
	 * @return the element removed
	 */
	public E removeLast();
	
	/**
	 * returns but doesnt remove the first element in list
	 * @return the first element in list
	 */
	public E first();
	
	/**
	 * returns but doesnt remove the last element in list
	 * @return last element in list
	 */
	public E last();
	
	/**
	 * prints the list 
	 */
	void printOutContent();
}



public interface SetInterface<T> 
{
	/**
	 *  Gets how many entries are in the setArray
	 * @return the integer value of entries in the setArray
	 */
	public int getCurrentSize();
	
	/**
	 * checks if any entries are in the setArray
	 * @return true if the setArray is empty and false if not empty. 
	 */
	public boolean isEmpty();
	
	/**
	 *  adds new entry to the setArray
	 * @param newEntry  entry being added to setArray
	 * @return true if entry can be added false if object cannot.
	 */
	public boolean add(T newEntry);
	
	/**
	 * removes specified entry from setArray
	 * @param anEntry the entry to be removed
	 * @return the entry removed or null
	 */
	public T remove (T anEntry);
	
	/**
	 * removes all entries in setArray
	 */
	public void clear();
	
	/**
	 * checks if specified entry is in setArray
	 * @param anEntry the entry that is being checked
	 * @return true if entry is in setArry or False if entry is not in set array.
	 */
	public boolean contains(T anEntry);
	
	/**
	 * Retrieves all entries in setArray
	 * @return A newly Allocated array of all the entries in the setArray
	 */
	public T[] toArray();

} // end interface

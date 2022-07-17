/**+
 * Program is designed to resemble a set with a finite capacity, where only unique(no duplicates) items can be stored. 
 * @author Aaron Jones
 * @version 06/13/2022
 *
 */
public final class ArraySet<T> implements SetInterface<String> 
{
	
	private int numberOfEntries;
	
	//default capacity for an ArraySet Constructor with no parameter.
	private static final int DEFAULT_CAPACITY=5;
	
	private final String[] SET;
	
	/**
	 * constructs and ArraySet object with a default capacity of 10 entries
	 */
	public ArraySet()
	{
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * constructs and ArraySet object with a capacity designated by the client using an integer value given in the parameter.
	 * @param requiredSize the required capacity of ArraySet object 
	 */
	public ArraySet(int requiredSize)
	{
		String[] tempSet = (String[])new String[requiredSize];
		this.SET = tempSet;
		numberOfEntries = 0;
	}
	
	/**
	 *  Gets how many entries are in the setArray
	 * @return the integer value of entries in the setArray
	 */
	public int getCurrentSize()
	{
		if (isEmpty()) 
		{
			return 0;
		}
		else
		{
			return this.numberOfEntries;
		
		}
	}
	
	/**
	 * checks if any entries are in the setArray
	 * @return true if the setArray is empty and false if not empty. 
	 */
	public boolean isEmpty()
	{
		return this.numberOfEntries <= 0;
	}
	
	/**
	 *  adds new entry to the setArray
	 * @param newEntry  entry being added to setArray
	 * @return true if entry can be added false if object cannot.
	 */
	public boolean add(String newEntry)
	{
		if(this.numberOfEntries>= this.SET.length)
		{
			return false;
		}
		else
		{ //Assertion: result is true here
			for(int i = 0; i<= this.numberOfEntries; i++)
			{
				if(newEntry.equals(this.SET[i]))
				{
					return false;
				}
				if(this.SET[i] == null)
				{
					this.SET[i]= newEntry;
					this.numberOfEntries++;
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * removes specified entry from setArray
	 * @param anEntry the entry to be removed
	 * @return the entry removed or null
	 */
	public String remove (String anEntry)
	{
		if(isEmpty() == true)
		{
			return null;
		}
		else
		{ //Assertion: result is true here
			for(int i = 0; i<= this.numberOfEntries; i++)
			{
				if(anEntry.equals(this.SET[i]))
				{
					this.SET[i]=null;
					this.numberOfEntries--;
					return anEntry;
				}

			}
			
		}
		return null;
	}
	
	/**
	 * removes all entries in setArray
	 */
	public void clear()
	{
		for(int i =0; i <= this.SET.length; i++)
		{
			this.SET[i]=null;
			this.numberOfEntries = 0;
		}
	}
	
	/**
	 * checks if specified entry is in setArray
	 * @param anEntry the entry that is being checked
	 * @return true if entry is in setArry or False if entry is not in set array.
	 */
	public boolean contains(String anEntry)
	{
		for(int i =0; i <= this.SET.length; i++)
		{
			if(anEntry.equals(this.SET[i]))
			{
				return true;
			}	
		}
		return true;

	}
	
	/**
	 * Retrieves all entries in setArray
	 * @return A newly Allocated array of all the entries in the setArray
	 */
	public String[] toArray()
	{
		String[] result = (String[]) new String[this.numberOfEntries];
		for(int i =0; i < this.SET.length; i++)
		{
			if(this.SET[i] == null)
			{
				continue;
			}
			else
			{
				result[i] =this.SET[i];
			}

		}
		return result;
	}

} //end ArraySet

/**
 * Bellow are the test results of my program.
 * 
 * Constructing an ArraySet without parameters with a default capicity of 5!
 * Testing the current size of the ArraySet.Should be 0!
 * Result---
 * 0
 * Calling the remove method to remove the following string (luigi) on an empty array set!
 * calling the add method a total of 8 times, 
 * and the remove method an additional time. 
 * Will be adding the following names in this order
 * Sarah, Kirby, Sarah, Yoshi, Mario, Jason from StateFarm, Kupa, and Eren.
 * The String Sarah is removed after the fourth add call
 * Result---
 * Mario, Kirby, Yoshi, Jason from StateFarm, Kupa, 
 * Testing the current size of the ArraySet. Should be 5.
 * 5
 */



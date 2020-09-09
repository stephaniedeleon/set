
//	Date: 		February 26, 2020
//	Description:	
//				This is the SetInterface.

public interface SetInterface<T> extends Iterable<T>{
	
	/** Tests whether the bag contains a given entry.
	 @param anEntry the entry to find
	 @return True whether it is found, false if not.
	 */
	public boolean contains(T anEntry);
	
		
	/** Removes one specified entry from bag.
	 * @param anEntry the entry to be removed 
	 * @return True if removal successful and false if not.
	 */
	public boolean remove(T anEntry);
	
	
	/** Adds a new entry to the bag.
	 * @param newEntry the object to be added as a new entry
	 * @return True if adding successful, and returns false if not because it is already in the set.
	 */
	public boolean add(T newEntry);
	
	
	/** Gets the current number of entries in the bag.
	 * @return The int number of entries in bag.
	 */
	public int length();
	
	
	/** Tests whether if every element in the first set is in the second set.
	 * @param rhsSet the set to be compared
	 * @return True if every element in first set is in second set, false otherwise
	 */
	public boolean subset(SetInterface<T> rhsSet);
	
	
	/**Tests whether two sets are equivalent to each other or not. Order does not matter.
	 * @param rhsSet the set to be compared
	 * @return True if both sets contain the same elements and false if not
	 */
	public boolean equals(SetInterface<T> rhsSet);
	
	
	/** 
	 * @param rhsSet the set to be combined
	 * @return A set that contains all the elements in the first and second set.
	 */
	public SetInterface<T> union(SetInterface<T> rhsSet);
	
	
	/** Gets the object's current state.
	 * @return A string that indicates the object's state.
	*/
	public String toString();

}

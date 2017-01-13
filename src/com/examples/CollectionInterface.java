package com.examples;

public class CollectionInterface {

	/*
	 * Collection is used to represent a group of individual objects in a single entity
	 * Basic add and remove operations - boolean add(obj o), boolean addAll(Coll c), boolean remove(obj o), boolean removeAll(Coll c), boolean retainAll(Coll c), void clear()
	 * Basic operations - boolean isEmpty(), int size(), boolean contains(obj o), boolean containsAll(Coll c)
	 * legacy support - Object[] toArray();
	 * Iteration support - Iterator iterator() - Iterator to iterate obj in one by one
	 * 
	 * 
	 * 
	 * Java has a collection Interface (1.2v)- which doesn't have concrete implementation and this is consider as a root interface
	 * -----------------------------------------------------------------------------------------------------------------------------
	 * 1. SET interface - No Duplicates , No insertion order preserved
	 *   SET I(1.2v) implements collection
	 *      |-------------------------------------|
	 *   HashSet C(1.2v)                      SortedSet I(1.2v)
	 *      |								      |
	 *   LinkedHashSet C(1.4v)              NavigableSet I(1.6v)
	 *                                            |
	 *                                        TreeSet C(1.2v)     
	 * -----------------------------------------------------------------------------------------------------------------------------
	 * 2. LIST interface - Duplicates allowed, Insertion order preserved.
	 *   LIST I(1.2v) implements collection
	 *      |-------------------------------------|--------------------------|
	 *   ArrayList C(1.2v)                  LinkedList C(1.2v)            Vector C(1.0v)
	 *   																	 |
	 *   																   Stack C(1.0v)
	 * -----------------------------------------------------------------------------------------------------------------------------
	 */
	
	
	/*
	 * MAP interface is not child interface of Collection (technically its not under collection category)
	 *  used to store KEY-VALUE pairs
	 *  Duplicate KEY is not allowed but VALUE can be duplicated
	 *  MAP I(1.2v)                                          Dictionary C(1.0v) 
	 *     |--------------------------|-----------------------------|-------------------------|-----------------------|
	 *  HashMap C(1.2v)          SortedMap I(1.2v)           HashTable C(1.0v)       WeakHashMap C(1.2v)        IdentityHashMap C(1.4v)
	 *     |                          |
	 *  LinkedHashMap C(1.4v)   NavigableMap I(1.6v)
	 *                                |
	 *                             TreeMap I(1.2v)                        
	 */
	
	
	/*
	 *       Arrays                              |       Collections
	 * -------------------------------------------------------------------------------------------
	 * 1.Fixed size                              |    1.Growable as per requirements  
	 * 2.memory occupied at initial stage        |    2.Memory can reuse
	 * 3.Good performance                        |    3.Poor performance
	 * 4.Homogeneous (Same object type is stored)|    4.Homogeneous and Heterogeneous
	 * 5.No ReadyMade data structure             |    5.ReadyMade data structure available
	 * 6.Primitives and Objects                  |    6.Only objects
 	 */ 
}

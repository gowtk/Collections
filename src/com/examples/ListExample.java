package com.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	/*
	 * List - Duplicates allowed , Insertion Order Preserved.
	 * 
	 * List also have some more operations addition to the collection operations, they are 
	 * 1.void add(int index, Object o); 
	 * 2.boolean addAll(Collections, int index); 
	 * 3.object get(int index); 
	 * 4.object remove(int index); 
	 * 5.boolean set(int index, Object o) - replace existing
	 * 
	 * List basically deals with index positions, so it provides some methods to get index, they are 
	 * 1.int list.indexOf("A"); 
	 * 2.int list.lastIndexOf("B");
	 *
	 * List provides ListIterator to travel one by one in list objects - it will return available index 
	 * ListIterator list.listIterator();
	 */

	public static void main(String[] args) {
		
		/*
		 * Re-sizable array algorithm is used 
		 * Heterogeneous objects can be added
		 * null insertion is possible 
		 * DEFAULT_CAPACITY = 10; NEW_CAPACITY =(CURRENT_CAPACITY * 3/2)+1 ==--->10-->16-->25
		 */
		callArrayList1();
		callArrayList2();
		callArrayList3();
		callArrayList4();
		
		callLinkedList1();
		callLinkedList2();
		callLinkedList3();
		callLinkedList4();
		
		/*
		 *                    ArrayList                  |                             LinkedList
		 *----------------------------------------------------------------------------------------------------------------
		 * 1. DS - resizeable or growable array          |  1. DS - double Linked list
		 * 2. Best for retrieval (RandomAccess I)        |  2. Worst for retrieval (travel to each node from starting)
		 * 3. Worst for Insertion and deletion in middle |  3. Best for Insertion and deletion in middle(simply changes prev and next pointer)
		 * 4. only asc order iteration                   |  4. asc and desc order iteration is possible  
		 * 
		 */

	}
		
	private static void callArrayList1() {
		System.out.println("-------------------ArrayList Example 1-------------------");
		ArrayList arrList1 = new ArrayList<>();
		arrList1.add("A");
		arrList1.add(10);
		arrList1.add("A");
		arrList1.add(null);
		System.out.println("ArrayList 1: " + arrList1); // [A,10,A,null]
		Object removedElement = arrList1.remove(2); // remove index:2
		System.out.println("Removed index 2 element is :" + removedElement); // 10
		arrList1.add(2, "B"); // add B in index:2
		arrList1.add("N"); // add N in last
		System.out.println("ArrayList 1: " + arrList1); // [A,10,B,null,N]
		System.out.println("ArrayList 1: second element: "+arrList1.get(1));

	}
	
	private static void callArrayList2() {
		System.out.println("-------------------ArrayList Example 2-------------------");
		ArrayList arrList2 = new ArrayList<>(12);// set initial capacity as 12
		
		// but here we are trying to add 15 elements in list 
		for (int i = 0; i < 15; i++) {
			boolean responseFlag = arrList2.add(i);
			System.out.println("index " + i + " Added: " + responseFlag);
		}
		System.out.println("ArrayList 2: " + arrList2); // Displays all 15 elements
	}

	private static void callArrayList3() {
		System.out.println("-------------------ArrayList Example 3-------------------");
		Collection collectionSet = new HashSet<>();
		collectionSet.add("java");
		collectionSet.add("testing");
		collectionSet.add("UI");

		// add other collection objects to List
		ArrayList arrList3 = new ArrayList<>(collectionSet);
		System.out.println("ArrayList 3: " + arrList3);
	}
	
	private static void callArrayList4() {
		System.out.println("-------------------ArrayList Example 4-------------------");
		List<String> charList = new ArrayList<>();
		charList.add("A");
		charList.add("B");
		charList.add("C");
		charList.add("D");
		charList.add("E");
		charList.add("F");
		
		Iterator<String> iterator = charList.iterator();
		while(iterator.hasNext()){
			System.out.println("iterator Element :"+iterator.next());
		}
		
		ListIterator<String> listIterator = charList.listIterator();
		while(listIterator.hasNext()){
			System.out.println("listIterator Element :"+listIterator.next());
		}
		
		while(listIterator.hasPrevious()){
			System.out.println("listIterator Element :"+listIterator.previous());
		}
		
	}


	private static void callLinkedList1() {
		System.out.println("-------------------LinkedList Example 1-------------------");
		LinkedList linkedList1 = new LinkedList<>();
		linkedList1.add("A");
		linkedList1.add(10);
		linkedList1.add("A");
		linkedList1.add(null);
		System.out.println("LinkedList 1: " + linkedList1); // [A,10,A,null]
		Object removedElement = linkedList1.remove(2); // remove index:2
		System.out.println("Removed index 2 element is :" + removedElement); // 10
		linkedList1.add(2, "B"); // add B in index:2
		linkedList1.add("N"); // add N in last
		System.out.println("LinkedList 1: " + linkedList1); // [A,10,B,null,N]
		System.out.println("LinkedList 1: second element: "+linkedList1.get(1));
		
	}
	
	private static void callLinkedList2() {
		System.out.println("-------------------LinkedList Example 2-------------------");
		//LinkedList arrList2 = new LinkedList<>(12);// NO initial capacity as like arrayList - default empty list
		LinkedList linkedList2 = new LinkedList<>(); // gre
		// but here we are trying to add 15 elements in list 
		for (int i = 0; i < 15; i++) {
			boolean responseFlag = linkedList2.add(i);
			System.out.println("index " + i + " Added: " + responseFlag);
		}
		System.out.println("LinkedList 2: " + linkedList2); // Displays all 15 elements
	}

	private static void callLinkedList3() {
		System.out.println("-------------------LinkedList Example 3-------------------");
		Collection collectionSet = new HashSet<>();
		collectionSet.add("java");
		collectionSet.add("testing");
		collectionSet.add("UI");

		// add other collection objects to List
		LinkedList linkedList3 = new LinkedList<>(collectionSet);
		System.out.println("LinkedList 3: " + linkedList3);
	}
	
	private static void callLinkedList4() {
		System.out.println("-------------------LinkedList Example 4-------------------");
		LinkedList<String> charList = new LinkedList<>();
		charList.add("A");
		charList.add("B");
		charList.add("C");
		charList.add("D");
		charList.add("E");
		charList.add("F");
		
		Iterator<String> ascIterator =charList.iterator();
		while(ascIterator.hasNext()){
			System.out.println("Asc order Element :"+ascIterator.next());
		}
		Iterator<String> descIterator =charList.descendingIterator();
		while(descIterator.hasNext()){
			System.out.println("Desc order Element :"+descIterator.next());
		}
		
		
	}
}

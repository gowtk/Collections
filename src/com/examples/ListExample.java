package com.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

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
	 * List provides ListIterator to travel one by one in list objects 
	 * - it will return available index ListIterator list.listIterator();
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
		
		callLinkedList();
	}
	
	private static void callArrayList1() {
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
	}
	
	private static void callArrayList2() {
		ArrayList arrList2 = new ArrayList<>(12);// set initial capacity as 12
		
		// but here we are trying to add 15 elements in list 
		for (int i = 0; i < 15; i++) {
			boolean responseFlag = arrList2.add(i);
			System.out.println("index " + i + " Added: " + responseFlag);
		}
		System.out.println("ArrayList 2: " + arrList2); // Displays all 15 elements
	}


	private static void callArrayList3() {
		Collection collectionSet = new HashSet<>();
		collectionSet.add("java");
		collectionSet.add("testing");
		collectionSet.add("UI");

		// add other collection objects to List
		ArrayList arrList3 = new ArrayList<>(collectionSet);
		System.out.println("ArrayList 3: " + arrList3);
	}

	private static void callLinkedList() {
		// TODO Auto-generated method stub

	}


}

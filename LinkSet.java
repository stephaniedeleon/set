
//	Date: 		February 26, 2020
//	Description:	
//				This is the LinkSet that implements SetInterface.


import java.util.Iterator;

public class LinkSet<T> implements SetInterface<T>{
	
	private int numberOfEntries;
	private Node firstNode;
	
		
	@Override
	public Iterator<T> iterator() {
		return new LinkSetIterator<>();
	}
	
	private class LinkSetIterator<T> implements Iterator<T> {
		
		private Node current;
		
		public LinkSetIterator() {
			current = firstNode;
		}
		
		@Override
		public boolean hasNext() {
			return current != null;
		}
		
		@Override
		public T next() {
			T data = null;
			
			if(hasNext()) {
				data = (T)current.data;
				current = current.next;
			}
			
			return data;
		}
		
	}
	
	
	
	private class Node {
		
		private T data;
		private Node next;
		
		private Node (T dataPortion) {
			this(dataPortion, null);
		}
		
		private Node (T dataPortion, Node nextNode) { //Two parts: data and reference to nextNode
			data = dataPortion;
			next = nextNode;
		}
		
	}
	
	
	
	public LinkSet() {
		
		firstNode = null;
		numberOfEntries = 0;

	}

	
	
	public boolean contains(T element) {
		
		boolean found = false;
		Node currentNode = firstNode;
		
		while (!found && currentNode != null) {
			if (element.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		}
		
		return found;
	}
	
	
	public boolean remove(T element) {
		
		boolean result = false;
		Node nodeN = getReferenceTo(element);
		
		if(nodeN != null) {
			
			nodeN.data = firstNode.data; //replace located entry with entry in first node.
			firstNode = firstNode.next; // remove first node
			numberOfEntries--;
			result = true;	
		}
		
		return result;	
	}
	
	private Node getReferenceTo(T anEntry) { //gets the reference to the node containing the entry
		
		boolean found = false;
		Node currentNode = firstNode;
		
		while(!found && currentNode != null) {
			
			if(anEntry.equals(currentNode.data)) 
				found = true;
			else 
				currentNode = currentNode.next;
		}
		
		return currentNode;		
	}
	
	
	public boolean add(T element) { 
		
		boolean result = false;
		Node currentNode = firstNode;
		
		
		if (numberOfEntries == 0) {
			
			Node newNode = new Node(element);
			firstNode = newNode;
			numberOfEntries++;
			result = true;
		}
		
		else {

			while (currentNode != null) {

				if (!element.equals(currentNode.data)) {
					
					result = true;
					currentNode = currentNode.next;
					
				} else {
					
					result = false;
					break;	
				}
			}
			
			if (result) {
				Node newNode = new Node(element);
				newNode.next = firstNode;
				firstNode = newNode;
				numberOfEntries++;
				result = true;
			}
			
		}
			
		return result;	
	}
	
	
	public int length() {
		
		return numberOfEntries;
		
	}
	
	
	public boolean subset(SetInterface<T> rhsSet) { 
		
		boolean result = false;
		Node currentNode = firstNode;
		
		if(numberOfEntries == 0 ) { //accounting for empty sets
			
			result = true;
		}
		
		else {
			
			while(currentNode != null) { 
				
				if(rhsSet.contains(currentNode.data)){
					
					currentNode = currentNode.next;
					result = true;
					
				} else {
					
					result = false;
					break;
				} 	 
			}
		}

		return result;
	}
	
	
	
	public boolean equals(SetInterface<T> rhsSet) { 
		
		boolean result = false;
		Node currentNode = firstNode;
		
		if(rhsSet.length() == numberOfEntries) {
			
			while(currentNode != null) {
				
				if (rhsSet.contains(currentNode.data)) {	
					
					currentNode = currentNode.next;
					result = true;	
					
				} else {
					
					result = false;
					break;
		
				}	
			}
		}
	
		return result;
	}
	
	
	public SetInterface<T> union(SetInterface<T> rhsSet) {   
		
		SetInterface<T> unionSet = new LinkSet<>();
		
		Iterator<T> itB = rhsSet.iterator();
		
		Node currentNode = firstNode;
		T current = itB.next();
				
		while(currentNode != null) { //traverses through the first set
			
			unionSet.add(currentNode.data); 
			currentNode = currentNode.next;
			
		} while(current != null) { //traverses through the second set
			
			unionSet.add(current); 
			current = itB.next();
			
		}
		
		return unionSet;
	}
	
	
	@Override 
	public String toString() { 
		
		Node currentNode = firstNode;	
		int count = 0;
		String elements = "";
		
		while (count < numberOfEntries) {
			
			if(count < numberOfEntries-1) { //accounts for the elements before the last element
				
				elements = elements + currentNode.data + ", "; 
				currentNode = currentNode.next;
				count++;
				
			} else if (count == numberOfEntries-1) { //accounts for the last element
				
				elements = elements + currentNode.data; //comma(,) is eliminated
				count++;
				
			}
			
		}
				
		return "{" + elements + "}";	
	}

}



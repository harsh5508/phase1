package phase1programs_3;

public class P5SinglyLL{
	
	    Node head; // head of list 
    	static class Node { 
        		int data; 
        		Node next; 
        		Node(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
    	} 
// insert a new node  
    	public static P5SinglyLL insert(P5SinglyLL list, int data) 
    	{ 
        		// Create a new node with given data 
        		Node new_node = new Node(data); 
        		new_node.next = null; 
   		// If the Linked List is empty, then make the new node as head 
        		if (list.head == null){ 
            			list.head = new_node; 
        		} 
        		else{ 
            			// Else traverse till the last node and insert the new_node there 
            			Node last = list.head; 
            			while (last.next != null){ 
                			last = last.next; 
            			}    			
            			last.next = new_node;  // Insert the new_node at last node 
        		} 
        		return list; 
    	} 
   	public static void printList(P5SinglyLL list) 
    	{	 
        		Node currNode = list.head; 
        		System.out.print("LinkedList: "); 
        		// Traverse through the LinkedList 
        		while (currNode != null){ 
            			// Print the data at current node 
            			System.out.print(currNode.data + " "); 
            			// Go to next node 
            			currNode = currNode.next; 
        		} 
        		System.out.println(); 
    	} 
    	// Method to delete a node 
    	public static P5SinglyLL deleteByKey(P5SinglyLL list, int key) 
    	{ 
        		// Store head node 
        		Node currNode = list.head, prev = null; 
        		if (currNode != null && currNode.data == key){ 
            			list.head = currNode.next; 
            			System.out.println(key + " found and deleted"); 
            			return list; 
        		} 
        		       while (currNode != null && currNode.data != key){ 
            			     prev = currNode; 
            			     currNode = currNode.next; 
        		            } 
        		if (currNode != null){ 
            			prev.next = currNode.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currNode == null){ 
            			System.out.println(key + " not found"); 
        		} 
        		return list; 
    	}
  public static void main(String[] args) 
    	{ 
        	
    		P5SinglyLL list = new P5SinglyLL(); 
        		
        		list = insert(list, 16); 
        		list = insert(list, 27); 
        		list = insert(list, 89); 
        		list = insert(list, 76); 
        		list = insert(list, 28); 
        		list = insert(list, 36); 
        		list = insert(list, 28); 
        		list = insert(list, 7); 
        		
        		printList(list); 
        		deleteByKey(list, 28);  
        		printList(list);
        		deleteByKey(list, 50); 
    	} 

}

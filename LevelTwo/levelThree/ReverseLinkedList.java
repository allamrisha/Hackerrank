package test;

/*
 * Algorithm :
 * Iterate through elements in the linked list until there is no more element
 * Change next node's data value to previous node's data value
 * Change previous node's data value to current node's value
 * Change current node's value to next node's value
 */
public class ReverseLinkedList {

	static ListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);
         
        System.out.println("Given Linked list");
        list.printList(head);   
        
        head=list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
       
	}
	private void printList(ListNode head2) {
		// TODO Auto-generated method stub
		while(head2!=null) {
			System.out.print(head2.data+" ");
			head2=head2.next;
		}	
	}
	
	ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }

}

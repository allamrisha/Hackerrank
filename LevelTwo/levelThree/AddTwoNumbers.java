package test;

/*
 * Algorithm
 * 	1. Use a carry bit to store the sum of two bits in the two linked lists
 * 		a.if the carry forward bit is>10 then store the remainder in the data field of result and extra bit 
 * 		is being forwarded to the next iteration
 * 		b.if the carry forward bit is <10 the store the number directly in the data field of result 
 * 		and the there is nothing to be forwarded for the next iteration
 * 	2. Continue this operation until both the numbers to be added have null values and there is nothing
 * 	   to be added
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ListNode l1=new ListNode(2);
			l1.next=new ListNode(4);
			l1.next.next=new ListNode(3);
			
			ListNode l2=new ListNode(5);
			l2.next=new ListNode(6);
			l2.next.next=new ListNode(4);
			
			ListNode res=addTwoNumbers(l1,l2);
			System.out.print(res.data+"->");
			System.out.print(res.next.data+"->");
			System.out.print(res.next.next.data);
	}
	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub	
		int carryForward=0;
		ListNode result=new ListNode(0);
		ListNode tmp1=l1,tmp2=l2,tmp3=result;

		while(tmp1!=null || tmp2!=null) {
			if(tmp1!=null) {
				carryForward+=tmp1.data;
				tmp1=tmp1.next;
			}
			if(tmp2!=null) {
				carryForward+=tmp2.data;
				tmp2=tmp2.next;
			}
			tmp3.next=new ListNode(carryForward%10);
			tmp3=tmp3.next;
			carryForward/=10;
		}
		if(carryForward==1)
			tmp3.next=new ListNode(1);
		
		return result.next;
	}

}

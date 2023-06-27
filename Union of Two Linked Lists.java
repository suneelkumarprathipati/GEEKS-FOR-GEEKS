class Sol
{
public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    TreeMap<Integer,Node> map = new TreeMap<>();
	    while(head1 != null){
	        map.putIfAbsent(head1.data , head1);
	        head1 = head1.next;
	    }
	    while(head2 != null){
	        map.putIfAbsent(head2.data , head2);
	        head2 = head2.next;
	    }
	    Node head = new Node(-1);
	    Node temp = head;
	    for(int k : map.keySet()){
	        temp.next = map.get(k);
	        temp = temp.next;
	        temp.next = null;
	    }
	    return head.next;
	}
}

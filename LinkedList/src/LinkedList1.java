   
public class LinkedList1 {
	Node head;
	
	LinkedList1(){
		this.head = null;
	}
	
	public void append(String val){
		if (head == null) {
			this.head = new Node(val);
			return;
		}
		
		Node curr = this.head;
		
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(val);
	}
	
	public void append(String val, int idx){
		Node curr = this.head;
		
		for( int i = 0; i < idx-1; i++) {
			if (curr.next == null) {
				System.out.println("Index not found");
				return;
			}
			curr = curr.next;
		}
		
		Node next = curr.next;
		curr.next = new Node(val);
		curr.next.next = next;
	}
	
	public Node delete(String val) {
		return _delete(val, this.head);
	}
	
	private Node _delete(String target, Node curr) {
		if (curr.next == null || curr == null) {
			System.out.println("Value not found");
			return this.head;
		}
		if( curr == this.head && curr.val == target) {
			this.head = curr.next;
			curr.next = null;
			return this.head;
		}
			
		if (curr.next.val == target ) {
			curr.next = curr.next.next;
			return this.head;
		}
		return _delete(target, curr.next);
	}

	public void print() {
		String output = _print(this.head);
		System.out.println( output );
	}
	
	private String _print(Node curr) {
		if (curr == null) return "";
		return curr.val + "->" + _print(curr.next);
	}
	
	public boolean contains(String val) {
		return _contains(val, this.head);
	}

	private boolean _contains(String target, Node curr) {
		if (curr == null) return false;
		if (curr.val.equals(target)) return true;
		return _contains(target, curr.next);
		
	}
	
	
}

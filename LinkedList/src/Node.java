
public class Node{
	String val;
	Node next;
	
	Node(String val){
		this.val = val;
		this.next = null;                     
	}
	
	public String toString() {
		return "Value of the node: " + this.val +
			   "\nNext node:" + this.next.val;
	}///
}    

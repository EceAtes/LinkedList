public class Main {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.append("a");
		list.append("b");
		list.append("c");
		list.append("d");
		System.out.println(list.contains("c"));
		list.print();
		list.append("e", 2);
		list.print();
		System.out.println(list.contains("e"));
		System.out.println(list.delete("n"));
		list.print();
	}

}

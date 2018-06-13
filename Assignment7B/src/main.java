import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlphabetLinkList alphabetList1 = new AlphabetLinkList();
		
		alphabetList1.enqueue("a");
		alphabetList1.enqueue("b");
		alphabetList1.enqueue("c");
		alphabetList1.enqueue("d");
		alphabetList1.enqueue("e");
		alphabetList1.enqueue("f");
		alphabetList1.enqueue("g");
		alphabetList1.enqueue("h");
		alphabetList1.enqueue("i");
		alphabetList1.enqueue("j");
		alphabetList1.enqueue("k");
		

		
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		System.out.println(alphabetList1.dequeue());
		
	}
}
